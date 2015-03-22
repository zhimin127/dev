$(function(){	
	$('.modal').on('shown.bs.modal', function () { 
        var h = $(this).find('.modal-dialog').height();
		$(this).find('.modal-dialog').css({
	        'margin-top': function () {
	            return ($(window).height() - h )/ 2;
	        }
    	});
	})
});