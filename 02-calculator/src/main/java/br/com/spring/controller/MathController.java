package br.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.math.OperationsMath;

@RestController
public class MathController {
	
	@Autowired
	OperationsMath opretaions;
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo ) throws Exception {
			
		return opretaions.calcSum(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/subtract/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtract(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo ) throws Exception {
		
		return opretaions.calcSubtract(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/multiply/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiply(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo ) throws Exception {
		
		return opretaions.calcMultiply(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/divide/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double divide(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo ) throws Exception {
			
		return opretaions.calcDivide(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/percent/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double percent(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo ) throws Exception {
			
		return opretaions.calcPercent(numberOne, numberTwo);
	}

	@RequestMapping(value = "/raiz/{number}", method = RequestMethod.GET)
	public Double raiz(@PathVariable("number") String number) throws Exception {
		
		return opretaions.calcRaiz(number);
	}
	
	@RequestMapping(value = "/media/{numberOne}/{numberTwo}/{numberThree}/{numberFour}/{numberFive}", method = RequestMethod.GET)
	public Double media(@PathVariable("numberOne") String numberOne, 
						@PathVariable("numberTwo") String numberTwo, 
						@PathVariable("numberThree") String numberThree, 
						@PathVariable("numberFour") String numberFour, 
						@PathVariable("numberFive") String numberFive) throws Exception {
		
		return opretaions.calcMedia(numberOne, numberTwo, numberThree, numberFour, numberFive);
	}
	
	


	
	
	
}
