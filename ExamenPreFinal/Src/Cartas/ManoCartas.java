package Cartas;
/*
 * Simula la mano de cartas de un jugador
 */
public class ManoCartas {
	
	LinkedPositionalList<Carta> ManoCartas;
	Position<Carta> corazones, diamantes,trebol, espada, auxiliar;
	public ManoCartas(){
		ManoCartas = new LinkedPositionalList<Carta>();
	}
	/*
	 * Este método agrega una carta a una Lista Posicional, donde se clasifica por Categoría
	 */
	public void AgregarCarta(String valor, String Categoria) {
		if(Categoria.toLowerCase() == "corazones") {
			if(ManoCartas.isEmpty() == true) {
				Carta NuevaCarta = new Carta();
				NuevaCarta.setValor(valor);
				NuevaCarta.setCategoría(Categoria);
				corazones =  ManoCartas.addFirst(NuevaCarta);
			}else {
				auxiliar = ManoCartas.first();
				while(ManoCartas.after(auxiliar) != null && auxiliar != corazones) {
					auxiliar = ManoCartas.after(auxiliar);
				}
				if(auxiliar == corazones) {
					Carta NuevaCarta = new Carta();
					NuevaCarta.setValor(valor);
					NuevaCarta.setCategoría(Categoria);
					corazones = ManoCartas.addAfter(corazones, NuevaCarta);
					
				} else if(auxiliar == diamantes) {
					Carta NuevaCarta = new Carta();
					NuevaCarta.setValor(valor);
					NuevaCarta.setCategoría(Categoria);
					corazones = ManoCartas.addAfter(diamantes, NuevaCarta);				
					} else if(auxiliar == trebol) {
						Carta NuevaCarta = new Carta();
						NuevaCarta.setValor(valor);
						NuevaCarta.setCategoría(Categoria);
						corazones = ManoCartas.addAfter(trebol, NuevaCarta);
					}else if(auxiliar == espada) {
						Carta NuevaCarta = new Carta();
						NuevaCarta.setValor(valor);
						NuevaCarta.setCategoría(Categoria);
						corazones = ManoCartas.addAfter(espada, NuevaCarta);				
						}
				} 
				
		
		} else if( Categoria.toLowerCase() == "diamantes") {
			if(ManoCartas.isEmpty() == true) {
				Carta NuevaCarta = new Carta();
				NuevaCarta.setValor(valor);
				NuevaCarta.setCategoría(Categoria);
				diamantes =  ManoCartas.addFirst(NuevaCarta);
			}else {
				auxiliar = ManoCartas.first();
				while(ManoCartas.after(auxiliar) != null && auxiliar != diamantes) {
					auxiliar = ManoCartas.after(auxiliar);
				}
				if(auxiliar == diamantes) {
					Carta NuevaCarta = new Carta();
					NuevaCarta.setValor(valor);
					NuevaCarta.setCategoría(Categoria);
					diamantes = ManoCartas.addAfter(diamantes, NuevaCarta);
					
				} else if(auxiliar == corazones) {
					Carta NuevaCarta = new Carta();
					NuevaCarta.setValor(valor);
					NuevaCarta.setCategoría(Categoria);
					diamantes = ManoCartas.addAfter(corazones, NuevaCarta);				
					} else if(auxiliar == trebol) {
						Carta NuevaCarta = new Carta();
						NuevaCarta.setValor(valor);
						NuevaCarta.setCategoría(Categoria);
						diamantes = ManoCartas.addAfter(trebol, NuevaCarta);
					}else if(auxiliar == espada) {
						Carta NuevaCarta = new Carta();
						NuevaCarta.setValor(valor);
						NuevaCarta.setCategoría(Categoria);
						diamantes = ManoCartas.addAfter(espada, NuevaCarta);				
						}
				} 
				
		} else if(Categoria.toLowerCase() == "treboles") {
			if(ManoCartas.isEmpty() == true) {
				Carta NuevaCarta = new Carta();
				NuevaCarta.setValor(valor);
				NuevaCarta.setCategoría(Categoria);
				trebol =  ManoCartas.addFirst(NuevaCarta);
			}else {
				auxiliar = ManoCartas.first();
				while(ManoCartas.after(auxiliar) != null && auxiliar != trebol) {
					auxiliar = ManoCartas.after(auxiliar);
				}
				if(auxiliar == trebol) {
					Carta NuevaCarta = new Carta();
					NuevaCarta.setValor(valor);
					NuevaCarta.setCategoría(Categoria);
					trebol = ManoCartas.addAfter(trebol, NuevaCarta);
					
				} else if(auxiliar == diamantes) {
					Carta NuevaCarta = new Carta();
					NuevaCarta.setValor(valor);
					NuevaCarta.setCategoría(Categoria);
					trebol = ManoCartas.addAfter(diamantes, NuevaCarta);				
					} else if(auxiliar == corazones) {
						Carta NuevaCarta = new Carta();
						NuevaCarta.setValor(valor);
						NuevaCarta.setCategoría(Categoria);
						trebol = ManoCartas.addAfter(corazones, NuevaCarta);
					}else if(auxiliar == espada) {
						Carta NuevaCarta = new Carta();
						NuevaCarta.setValor(valor);
						NuevaCarta.setCategoría(Categoria);
						trebol = ManoCartas.addAfter(espada, NuevaCarta);				
						}
				} 
			
		} else if(Categoria.toLowerCase() == "espadas") {
			if(ManoCartas.isEmpty() == true) {
				Carta NuevaCarta = new Carta();
				NuevaCarta.setValor(valor);
				NuevaCarta.setCategoría(Categoria);
				espada =  ManoCartas.addFirst(NuevaCarta);
			}else {
				auxiliar = ManoCartas.first();
				while(ManoCartas.after(auxiliar) != null && auxiliar != espada) {
					auxiliar = ManoCartas.after(auxiliar);
				}
				if(auxiliar == espada) {
					Carta NuevaCarta = new Carta();
					NuevaCarta.setValor(valor);
					NuevaCarta.setCategoría(Categoria);
					espada = ManoCartas.addAfter(espada, NuevaCarta);
					
				} else if(auxiliar == diamantes) {
					Carta NuevaCarta = new Carta();
					NuevaCarta.setValor(valor);
					NuevaCarta.setCategoría(Categoria);
					espada = ManoCartas.addAfter(diamantes, NuevaCarta);				
					} else if(auxiliar == trebol) {
						Carta NuevaCarta = new Carta();
						NuevaCarta.setValor(valor);
						NuevaCarta.setCategoría(Categoria);
						espada = ManoCartas.addAfter(trebol, NuevaCarta);
					}else if(auxiliar == corazones) {
						Carta NuevaCarta = new Carta();
						NuevaCarta.setValor(valor);
						NuevaCarta.setCategoría(Categoria);
						espada = ManoCartas.addAfter(corazones, NuevaCarta);				
						}
				} 
		}
		
	
	}
	/*
	 * Este método remueve  una carta de una Lista Posicional, donde se clasifica por Categoría
	 */
public  void jugar(String Categoria) {
		if(Categoria.toLowerCase() == "corazones") {
			auxiliar = ManoCartas.first();
			while(auxiliar != null && auxiliar != corazones) {
				auxiliar = ManoCartas.after(auxiliar);
			}
			if(auxiliar == null) {
				
			} else {
				if (ManoCartas.before(corazones) != diamantes && ManoCartas.before(corazones) != trebol && ManoCartas.before(corazones) != espada) {
					corazones = ManoCartas.before(corazones);
					ManoCartas.remove(auxiliar);
				} else  {
					ManoCartas.remove(corazones);
			} 
				
			}
		}else if(Categoria.toLowerCase() == "diamantes") {
			auxiliar = ManoCartas.first();
			while(auxiliar != null && auxiliar != diamantes) {
				auxiliar = ManoCartas.after(auxiliar);
			}
			if(auxiliar == null) {
				
			} else {
				if (ManoCartas.before(diamantes) != corazones && ManoCartas.before(diamantes) != trebol && ManoCartas.before(diamantes) != espada) {
					diamantes = ManoCartas.before(diamantes);
					ManoCartas.remove(auxiliar);
				} else  {
					ManoCartas.remove(diamantes);
			} 
				
			}
	}if(Categoria.toLowerCase() == "treboles") {
		auxiliar = ManoCartas.first();
		while(auxiliar != null && auxiliar != trebol) {
			auxiliar = ManoCartas.after(auxiliar);
		}
		if(auxiliar == null) {
			
		} else {
			if (ManoCartas.before(trebol) != diamantes && ManoCartas.before(trebol) !=corazones && ManoCartas.before(trebol) != espada) {
				trebol = ManoCartas.before(trebol);
				ManoCartas.remove(auxiliar);
			} else  {
				ManoCartas.remove(trebol);
		} 
			
		}
}
	if(Categoria.toLowerCase() == "espadas") {
		auxiliar = ManoCartas.first();
		while(auxiliar != null && auxiliar != espada) {
			auxiliar = ManoCartas.after(auxiliar);
		}
		if(auxiliar == null) {
			
		} else {
			if (ManoCartas.before(espada) != diamantes && ManoCartas.before(espada) != trebol && ManoCartas.before(espada) != corazones) {
				espada = ManoCartas.before(espada);
				ManoCartas.remove(auxiliar);
			} else  {
				ManoCartas.remove(espada);
		} 
			
		}
}
}
}
