var operatingSystem;

$('#os-form input').on('change', function() {
	x = $('input[name=os]:checked', '#os-form').val();
	$(".os-header").html("You have selected " + operatingSystem);
});