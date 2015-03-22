(function($) {
	function _137(_138, _139) {
		_139 = _139 || {};
		if (_139.onSubmit) {
			if (_139.onSubmit.call(_138) == false) {
				return;
			}
		}
		var form = $(_138);
		if (_139.url) {
			form.attr("action", _139.url);
		}
		var _13a = "easyui_frame_" + (new Date().getTime());
		var _13b = $("<iframe id=" + _13a + " name=" + _13a + "></iframe>").attr("src", window.ActiveXObject ? "javascript:false" : "about:blank").css({
			position : "absolute",
			top : -1000,
			left : -1000
		});
		var t = form.attr("target"), a = form.attr("action");
		form.attr("target", _13a);
		try {
			_13b.appendTo("body");
			_13b.bind("load", cb);
			form[0].submit();
		} finally {
			form.attr("action", a);
			t ? form.attr("target", t) : form.removeAttr("target");
		}
		var _13c = 10;
		function cb() {
			_13b.unbind();
			var body = $("#" + _13a).contents().find("body");
			var data = body.html();
			if (data == "") {
				if (--_13c) {
					setTimeout(cb, 100);
					return;
				}
				return;
			}
			var ta = body.find(">textarea");
			if (ta.length) {
				data = ta.value();
			} else {
				var pre = body.find(">pre");
				if (pre.length) {
					data = pre.html();
				}
			}
			if (_139.success) {
				_139.success(data);
			}
			setTimeout(function() {
				_13b.unbind();
				_13b.remove();
			}, 100);
		}
		;
	}
	;
	function load(_13d, data) {
		if (typeof data == "string") {
			$.ajax({
				url : data,
				dataType : "json",
				success : function(data) {
					_13e(data);
				}
			});
		} else {
			_13e(data);
		}
		function _13e(data) {
			var form = $(_13d);
			for ( var name in data) {
				var val = data[name];
				$("input[name=" + name + "]", form).val(val);
				$("textarea[name=" + name + "]", form).val(val);
				$("select[name=" + name + "]", form).val(val);
				if ($.fn.combobox) {
					$("select[comboboxName=" + name + "]", form).combobox("setValue", val);
				}
				if ($.fn.combotree) {
					$("select[combotreeName=" + name + "]", form).combotree("setValue", val);
				}
			}
		}
		;
	}
	;
	function _13f(_140) {
		$("input,select,textarea", _140).each(function() {
			var t = this.type, tag = this.tagName.toLowerCase();
			if (t == "text" || t == "password" || tag == "textarea") {
				this.value = "";
			} else {
				if (t == "checkbox" || t == "radio") {
					this.checked = false;
				} else {
					if (tag == "select") {
						this.selectedIndex = -1;
					}
				}
			}
		});
	}
	;
	function _141(_142) {
		var _143 = $.data(_142, "form").options;
		var form = $(_142);
		form.unbind(".form").bind("submit.form", function() {
			_137(_142, _143);
			return false;
		});
	}
	;
	function _144(_145) {
		if ($.fn.validatebox) {
			var box = $(".validatebox-text", _145);
			if (box.length) {
				box.validatebox("validate");
				box.trigger("blur");
				var _146 = $(".validatebox-invalid:first", _145).focus();
				return _146.length == 0;
			}
		}
		return true;
	}
	;
	$.fn.form = function(_147, _148) {
		if (typeof _147 == "string") {
			switch (_147) {
			case "submit":
				return this.each(function() {
					_137(this, $.extend({}, $.fn.form.defaults, _148 || {}));
				});
			case "load":
				return this.each(function() {
					load(this, _148);
				});
			case "clear":
				return this.each(function() {
					_13f(this);
				});
			case "validate":
				return _144(this[0]);
			}
		}
		_147 = _147 || {};
		return this.each(function() {
			if (!$.data(this, "form")) {
				$.data(this, "form", {
					options : $.extend({}, $.fn.form.defaults, _147)
				});
			}
			_141(this);
		});
	};
	$.fn.form.defaults = {
		url : null,
		onSubmit : function() {
		},
		success : function(data) {
		}
	};
})(jQuery);