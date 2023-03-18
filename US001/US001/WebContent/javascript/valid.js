function chkName()
{
	var username=document.getElementById('username').value;
	var letters=/^[a-zA-Z0-9]+$/;
	
	
		
		if(username!=null && username.length>=5)
		  {
		    if (username.match(letters)) 
		      {
		    	return true;
		      }
		    else
			  {
		    	alert('Only alphanumeric characters are allowed');
		        //username.focus();
		       return false;
			  }
		  }
		  else
		  {
		    alert("Please enter the username of minimum length of 5 alphanumeric characters ");
		    //username.focus();
		    return false;
		   }
		
}



function chkNewPassword()
{
	
	var p = document.getElementById('newPassword').value,
    errors = [];
if (p.length < 10) {
    errors.push("Your password must be at least 10 characters"); 
}
if (p.search(/[a-z]/) < 0) {
    errors.push("Your password must contain at least lowercase letter.");
}
if (p.search(/[A-Z]/) < 0) {
    errors.push("Your password must contain at least one uppercase letter.");
}
if (p.search(/[0-9]/) < 0) {
    errors.push("Your password must contain at least one digit."); 
}
if (p.search(/[ !@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]/) < 0) {
    errors.push("Your password must contain at least one special character."); 
}


if (errors.length > 0) {
    alert(errors.join("\n"));
    return false;
}
return true;
}


