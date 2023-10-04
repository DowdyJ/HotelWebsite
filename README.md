# Mock Hotel Web Service
This project is my final project submission for the Advanced Java course at WGU. 


## Running the Solution
The solution consists of two parts: the Angular frontend and Java backend. To view the site, you will need to run both.
You will need Docker, Nodejs, and Angular-CLI installed to continue.

### Launching the Backend
1. In the root folder of the solution, run `docker build -t landon_hotel .`
2. Run `docker run -it -p 8080:8080 --name D387_000877914 --rm landon_hotel`

This will expose the webapp on port 8080, if available.

### Launching the Frontend
1. Navigate to src/main/UI/
2. Run `npm install`
3. Run `ng build`
4. Run `ng serve`

When both the frontend and backend are running, you can use the site by connecting to http://localhost:4200/.

## Acknowledgements
A large portion of the original project was provided by WGU. Substantial additions and changes were made to the backend, but only minor changes to the Angular frontend.

