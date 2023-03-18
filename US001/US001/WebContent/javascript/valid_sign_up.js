function chkFirstName()
{
var firstName=document.getElementById('fname').value;
var letters=/^[a-zA-Z]+$/;
if(firstName!=null && firstName.length>0)
  {
    if (firstName.match(letters)) 
      {
    	return true;
      }
    else
	  {
    	alert('Only alphabets are allowed');
        //firstName.focus();
       return false;
	  }
  }
  else
  {
    alert("Please enter the first name");
    //city.focus();
    return false;
   }
}



function chkLastName()
{
	var lastName=document.getElementById('lname').value;
	var letters=/^[a-zA-Z]+$/;
	if(lastName!=null && lastName.length>0)
	  {
	    if (lastName.match(letters)) 
	      {
	    	return true;
	      }
	    else
		  {
	    	alert('Only alphabets are allowed');
	        //lastName.focus();
	       return false;
		  }
	  }
	  else
	  {
	    alert("Please enter the last name");
	    //lastName.focus();
	    return false;
	   }
}





function chkDateOfBirth()
{
var dob=document.getElementById('dob').value;

if(dob!=null && dob.length>0)
	{
	return true;
	
	}
else{
	alert("Please enter Date of birth");
	//dob.focus();
	return false;
}
}











function chkEmail()
{
var email=document.getElementById('email').value;
var atpos = email.indexOf("@");
var dotpos = email.lastIndexOf(".");

if(email==null && email.length>0)
{
alert("Please enter Email address");
//dob.focus();
return false;
}

if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) 
{
    alert("Not a valid e-mail address");
    //email.focus();
    return false;
}

return true;
}



function chkNumber()
{
var phno=document.getElementById('phno').value;
var letters=/^[0-9]+$/;

if(phno!=null && phno.length>0)
{
if(phno.match(letters))
	{
	return true;
	}
else{
	alert("Please enter Numeric value for Phone Number");
	//salary.focus();
	return false;
}
}
else
{
alert("Please enter the Phone Number ");
//salary.focus();
return false;
}
}






function chkUserId()
{
	var userid=document.getElementById('userid').value;
	var letters=/^[a-zA-Z0-9]+$/;
	
	
		
		if(userid!=null && userid.length>=8)
		  {
		    if (userid.match(letters)) 
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
		    alert("Please enter the User Id of minimum length of 8 alphanumeric characters ");
		    //username.focus();
		    return false;
		   }
		
}






function chkSQun()
{

	var squestion=document.getElementById('squestion').value;
	
	if(squestion!=null && squestion.length>0)
	{
	return true;
	
	}
else{
	alert("Please enter Secrete Question");
	//squestion.focus();
	return false;
}

}






function chkSAns()
{
var sans=document.getElementById('sans').value;
	
	if(sans!=null && sans.length>0)
	{
	return true;
	
	}
else{
	alert("Please enter Secrete Answer.");
	//sans.focus();
	return false;
}

}






function chkPassword()
{
	
	var p = document.getElementById('password').value,
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







function chkRole()
{
	var role=document.getElementById('role').value;
    if(role=="0")
	  {
	    alert("Please select Role");
	     //role.focus();
	    return false;
	
	  }
    else
	 {
	 return true;
	 }
}