<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
		<title>Merry Christmas</title>
		<meta name="viewport" content="width=device-width,user-scalable=yes">
        <link href="christmas.css" rel='stylesheet' type="text/css">
    	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=yes">
		
  	</head>
  	<body>
    	<p class="topster" align="center" id="part1">
			Your Christmas Greeting is being generated!<br/>
			Thank you for your patience.<br/>
			<svg class="spinner-container" width="65px" height="65px" viewBox="0 0 52 52">
      			<circle class="path" cx="26px" cy="26px" r="20px" fill="none" stroke-width="4px"></circle>
    		</svg>
			<br/>
		</p>
		<span class="imported" id="part2" >
			<blockquote>
				<% String api = (String)request.getAttribute("message");
				out.println(api);
				%>
			</blockquote>
		</span>
		<footer class="imported2">
			&copy;SwG Ghosh<br/>
        	<a href="https://twitter.com/SwG_Ghosh" class="twitter-follow-button" data-show-count="false" data-size="large">Follow @SwG_Ghosh</a>
			<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
        </footer>
    	<p class="logo" align="center"><a href="https://www.openshift.com/"></a></p>
		<script>
			function show() {
				document.getElementById("part1").style.display="block";
				document.getElementById("part2").style.display="none";
				setTimeout("hide()", 5000); //5 Seconds
			}
			
			function hide() {
				document.getElementById("part1").style.display="none";
				document.getElementById("part2").style.display="block";
			}
			show();
		</script>
	</body>
</html>
