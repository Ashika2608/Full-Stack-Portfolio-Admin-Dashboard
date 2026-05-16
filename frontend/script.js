document.getElementById('contactForm').addEventListener('submit', async function (e) {
    e.preventDefault(); // Prevents the web page from refreshing on submit

    // Grab the values entered by the user
    const nameValue = document.getElementById('name').value;
    const emailValue = document.getElementById('email').value;
    const messageValue = document.getElementById('message').value;
    const statusText = document.getElementById('formStatus');

    // Create the JSON payload object matching our Spring Boot entity structure
    const data = {
        name: nameValue,
        email: emailValue,
        message: messageValue
    };

    try {
        // Send a POST request to our running Spring Boot REST Endpoint
        const response = await fetch('http://localhost:8080/api/contact', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        });

        if (response.ok) {
            statusText.style.color = '#38bdf8'; // Success Blue color
            statusText.innerText = 'Message sent successfully to MySQL database!';
            document.getElementById('contactForm').reset(); // Clear input fields
        } else {
            statusText.style.color = '#ef4444'; // Error Red color
            statusText.innerText = 'Failed to save message. Server returned an error.';
        }
    } catch (error) {
        statusText.style.color = '#ef4444';
        statusText.innerText = 'Error: Is your Spring Boot backend server running on port 8080?';
        console.error('API Connection Error:', error);
    }
});