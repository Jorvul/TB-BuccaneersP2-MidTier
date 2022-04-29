package com.rtw.Project2.Controller;
	import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
/*	
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	
	import org.springframework.ui.Model;
	
	import org.springframework.web.bind.annotation.RequestParam;
	*/

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rtw.Project2.Model.Client;

import com.rtw.Project2.Repository.ClientRepository;

import com.rtw.Project2.Exceptions.ResourceNotFoundException;
	
	
	/*Angular connection
	//@CrossOrigin(origins = "http://localhost:8084/)
	*/
	
	@RestController
	@CrossOrigin(origins = "*")
	public class ClientController{
		//DEP. INJ.
		@Autowired
		ClientRepository clientRepo;
		
		//CREATE CLIENT
		@PostMapping("/client")
		public Client createClient(@RequestBody Client client) {
			
			return clientRepo.save(client);
		}
		
		//GET ALL CLIENTS
		@GetMapping("/client/all")
		public List<Client> getAllClients()
				throws ResourceNotFoundException {
			// clientRepo.findAll().orElseThrow(() -> new ResourceNotFoundException("No clients found at all(OUT OF BUSINESS) :: " + clientId));;
			return clientRepo.findAll();
		}
		
		//GET CLIENT BY ID
		@GetMapping("/client/{id}")
		   // @RequestMapping(value="",method = RequestMethod.POST)
		    public ResponseEntity<Client> getClientById(@PathVariable(value = "id") Long clientId)
		        throws ResourceNotFoundException {
		        Client client = clientRepo.findById(clientId)
		          .orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + clientId));
		        return ResponseEntity.ok().body(client);
		    }
		
		//DELETE CLIENT BY ID
		@DeleteMapping("/client/{id}")
	    public Map<String, Boolean> deleteClient(@PathVariable(value = "id") Long clientId)
	         throws ResourceNotFoundException {
			Client client = clientRepo.findById(clientId)
	       .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + clientId));

			clientRepo.delete(client);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }
		//UPDATE CLIENT BY ID
		 @PutMapping("/client/{id}")
		    public ResponseEntity<Client> updateEmployee(@PathVariable(value = "id") Long clientId,
		         @RequestBody Client clientDetails) throws ResourceNotFoundException {
		        Client client = clientRepo.findById(clientId)
		        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + clientId));

		        client.setClient_age(clientDetails.getClient_age());
		        client.setClient_name(clientDetails.getClient_name());
		        client.setClient_cap_hit(clientDetails.getClient_cap_hit());
		        client.setClient_position(clientDetails.getClient_position());
		        client.setClient_base_salary(clientDetails.getClient_base_salary());
		        client.setClient_signing_bonus(clientDetails.getClient_signing_bonus());
		        client.setClient_merchandise(clientDetails.getClient_merchandise());
		        client.setClient_active(clientDetails.getClient_active());
		        client.setClient_salary_increase(clientDetails.getClient_salary_increase());
		        
		        final Client updatedEmployee = clientRepo.save(client);
		       
		        return ResponseEntity.ok(updatedEmployee);
		    }
		 //Custom from Repo
		 //GET CLIENT BY NAME 
	/*	 @GetMapping("/client/name/{name}") //param was /client/name/{name}
	     public List<Client> getEmployeesByName(@PathVariable("name") String cliName){
	         return clientRepo.findClientByName(cliName);
	     }*/

/***************************************MOVE TO JSP FILE*********************************************************/
		 
		//Operable
		@RequestMapping("/crt")
		public String viewchkDisplay(){
			return "myform"; 
		}
		
		//@RequestMapping(path="/client", method=RequestMethod.POST)
		//@RequestMapping("/processingForm")  // , method = RequestMethod.POST
		//Operable
		@PostMapping(value="/processingForm")
		public String processingForm(
		
				@RequestParam("client_id") int client_id,
				@RequestParam("client_age") int client_age,
				@RequestParam("client_name") String client_name,
				@RequestParam("client_position") String position,
				@RequestParam("client_cap_hit") int capSalary,
				@RequestParam("client_base_salary") int baseSalary, 
				@RequestParam("client_signing_bonus") int signingBonus, 
				@RequestParam("client_merchandise") int merchandiseTotal,
				@RequestParam("client_active") int active, 
				@RequestParam("client_salary_increase") int salaryIncrease,
				
				Model model) {
				
				String clientPersonalMess = " Client\n Id: "+client_id +"\n Age: "+client_age+"\n Name: "+ client_name
						+"Position: "+position+"\nCap Salary: " + capSalary +"\n Base_salary: "+ baseSalary +"\nSigning Bonus "
						+ signingBonus+"\nMerchandise Total: "+ merchandiseTotal+"\nActive: "+ active+ "\n Salary Increase: "+salaryIncrease;
						
				model.addAttribute("clientObj", clientPersonalMess);
				
				return "formfilled";
		}

}
