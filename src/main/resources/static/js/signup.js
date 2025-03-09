$(document).ready(function() {
    $("#signupForm").submit(function(event) {
        event.preventDefault();
        let userData = {
            name: $("#name").val(),
            email: $("#email").val(),
            password: $("#password").val()
        };
        $.ajax({
            url: "http://localhost:8081/signup",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify(userData),
            success: function(response) {
                alert("User registered successfully!");
            }
        });
    });
});