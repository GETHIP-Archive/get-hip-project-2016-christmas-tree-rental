if(document.readyState == "complete") {
    console.log("ready");
    document.getElementById("loading").style.display="none";
    document.getElementById("page").style.display="block";
}
while(document.readyState != "complete") {
    setTimeout(function() {
       if(document.readyState == "complete") {
            console.log("ready");
            document.getElementById("loading").style.display="none";
            document.getElementById("page").style.display="block";
        } 
    }, 200);
}