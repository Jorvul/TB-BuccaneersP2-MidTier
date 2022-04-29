<h2>Create Client Form</h2>

<form action="processingForm" method="POST">

<input type="number" name ="client_id" placeHolder ="Enter The Client's id"/>
<br/>
<input type="number" name ="client_age" placeHolder ="Enter  Client's age"/>
<br/>
<input type="text" name ="client_name" placeHolder ="Enter Client's Name"/>
<br/>
<input type="text" name ="client_position" placeHolder ="Enter  Client's position"/>
<br/>
<input type="number" name ="client_cap_hit" placeHolder ="Client's salary cap"/>
<br/>
<input type="number" name ="client_base_salary" placeHolder ="Client's base salary"/>
<br/>
<input type="number" name ="client_signing_bonus" placeHolder ="Client's signing bonus"/>
<br/>
<input type="number" name="client_merchandise" placeholder ="Client's merchandise total"/>
<br/>
<label>Active?</label>
<input type="checkbox" name ="client_active" placeHolder ="Client Active (yes/no)"/>
<br/>
<label>Salary Increase?</label>
<input type="checkbox" name="client_salary_increase" placeholder ="Salary increase"/>
<br/>
<input type="submit"/>
</form>