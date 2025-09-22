/**
 * 
 */
package com.reydevco.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.reydevco.projectjsf.entity.Empleado;

/**
 * @author Rey David Martínez Olivares
 *Clase que permite realizar la lógica de negocio para empleados
 */
public class EmpleadoService {
	/**
	 * Método que permite consultar la lista de empleados de empresas de TI
	 * @return {@link Empleado} lista de empleados
	 */
	public List<Empleado> consultarEmpleados() {
		
		//Generando la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("López");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerApellido("López");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("López");
		empleadoApple.setSegundoApellido("Romero");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);
		
		//:::::::::::::::::::::::::::::::::::::::::::::::::://
		
		empleadoHP.setNombre("Pedro");
		empleadoHP.setPrimerApellido("Paniagua");
		empleadoHP.setSegundoApellido("López");
		empleadoHP.setPuesto("Senior Developer Java");
		empleadoHP.setEstatus(true);
		
		empleadoOracle.setNombre("Santiago");
		empleadoOracle.setPrimerApellido("López");
		empleadoOracle.setSegundoApellido("Romero");
		empleadoOracle.setPuesto("CEO");
		empleadoOracle.setEstatus(true);
		
		empleadoNetflix.setNombre("Juan");
		empleadoNetflix.setPrimerApellido("López");
		empleadoNetflix.setSegundoApellido("Romero");
		empleadoNetflix.setPuesto("Architect");
		empleadoNetflix.setEstatus(true);
		
		empleadoDeloitte.setNombre("Judas");
		empleadoDeloitte.setPrimerApellido("Paniagua");
		empleadoDeloitte.setSegundoApellido("López");
		empleadoDeloitte.setPuesto("Senior Developer Java");
		empleadoDeloitte.setEstatus(true);
		
		empleadoDisney.setNombre("Lucas");
		empleadoDisney.setPrimerApellido("López");
		empleadoDisney.setSegundoApellido("Romero");
		empleadoDisney.setPuesto("CEO");
		empleadoDisney.setEstatus(true);
		
		empleadoAmazon.setNombre("Pablo");
		empleadoAmazon.setPrimerApellido("López");
		empleadoAmazon.setSegundoApellido("Romero");
		empleadoAmazon.setPuesto("Architect");
		empleadoAmazon.setEstatus(true);
		
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoDisney);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoNetflix);
		
		return empleados;
	}
}
