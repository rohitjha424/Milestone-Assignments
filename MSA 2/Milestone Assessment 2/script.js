//Form validation 


function validateForm() {
    var pw = document.getElementById("pswd").value;
    var usName = document.getElementById("emp_name").value;
    
////////// // Employee Name Validations//////////////////////////////////

    //check empty Name field
    if(usName ==""){
      document.getElementById("message").innerHTML = "**Fill the Employee Name please!";
      return false;
    }

    //Minimum Name length validation
    if(usName.length <4){
      document.getElementById("message").innerHTML = "** Employee Name must be atleast 4 characters";
      return false;

    }

    //check Maximum name Length Validations
    if(usName.length > 16) {
      document.getElementById("message").innerHTML = "**Employee Name must not exceed 16 characters";
      return false;
   }

   // Check First Character of name Must be upprcase
   regexp = /^[A-Z]/;

   if (!regexp.test(usName))
    {
      document.getElementById("message").innerHTML = "**Employee Name's First Character should be uppercase";
      return false;
    } 
 


            //////////Hobbies Check boxes validation /////////////////

    var checkboxs=document.getElementsByName("hobby");
    var okay=false;
    var count =0;
    for(var i=0,l=2;i<l;i++)
    {
        if(checkboxs[i].checked)
        {
            count++;
            
        }
    }
    if(count<2)
    {
      document.getElementById("message").innerHTML = "**Select altlease 2 hobbies";
      return false;

    }
    



                    ////////// // Password Validations//////////////////////////////////



    //check empty password field
    if(pw == "") {
       document.getElementById("message").innerHTML = "**Fill the password please!";
       return false;
    }
   

   //minimum password length validation
    if(pw.length < 8) {
       document.getElementById("message").innerHTML = "**Password length must be atleast 8 characters";
       return false;
    }
  
  //maximum length of password validation
    if(pw.length > 16) {
       document.getElementById("message").innerHTML = "**Password length must not exceed 16 characters";
       return false;
    }
    
    
    else{
        
      function myFunction() {
          window.open("success.html");      // open a new HTML Page After successfully filling of form
        }
        myFunction();
  }



  } 

  




