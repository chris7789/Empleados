package empleado;

public class EmpleadoBR {
	
	private String tipoEmpleado;
	private float salarioBruto;
	private float horaExtra;
	private String ventaMes;
	private float salarioBase;
			
	
	
	
	public EmpleadoBR(String tipoEmpleado, float salarioBruto, float horaExtra, String ventaMes, float salarioBase) {
		
		this.tipoEmpleado = tipoEmpleado;
		this.salarioBruto = salarioBruto;
		this.horaExtra = horaExtra;
		this.ventaMes = ventaMes;
		this.salarioBase = salarioBase;
		
		
	}
	
	
	public float calculaSalarioBruto(String tipoEmpleado, float ventasMes, float horasExtra) {
		
		
		
		
		if(tipoEmpleado.equalsIgnoreCase("encargado")) {
			
			salarioBase = 1500;
		}
		if(tipoEmpleado.equalsIgnoreCase("vendedor")) {
			
			salarioBase = 1000;
		}
		
		
		if(ventasMes >= 1000) {
		
			salarioBase += 100;
		
		}
		if(ventasMes == 1500) {
			
			salarioBase += 200;
			
		}
		
		
		return salarioBase += 20 * horasExtra;
				
		
	}
	
	
	float calculaSalarioNeto(float salarioBruto) {
		
		if(salarioBruto > 1000 && salarioBruto < 1500) {
			
			
			
		}
		
		
	}
}
