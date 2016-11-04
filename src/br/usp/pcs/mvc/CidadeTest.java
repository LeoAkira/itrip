package br.usp.pcs.mvc;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
public class CidadeTest {

	private Cidade cidade1;
	@Before
	public void setup(){
		this.cidade1 = new Cidade("123", "Sao Paulo", true,4);
	}
}
	