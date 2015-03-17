
function initWinPosition(winId){
	var _scrollHeight = $(document).scrollTop(), // 获取当前窗口距离页面顶部高度
	_windowHeight = $(window).height(), // 获取当前窗口高度
	_windowWidth = $(window).width(), // 获取当前窗口宽度
	_popupHeight = $(winId).height(), // 获取弹出层高度
	_popupWeight = $(winId).width();// 获取弹出层宽度
	_posiTop = (_windowHeight - _popupHeight) / 2 + _scrollHeight;
	_posiLeft = (_windowWidth - _popupWeight) / 2;
	$(winId).css({'padding-top':_posiTop});
}
