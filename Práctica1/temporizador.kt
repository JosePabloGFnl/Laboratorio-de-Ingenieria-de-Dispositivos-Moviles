fun main(args: Array<String>){  

var segundos: Int 
var minutos: Int 
var horas: Int 
var finalizar: Int = 0

println("Seleccione las horas minutos y segundos")
print("Horas:")
horas = readLine()!!.toInt()
print("Minutos:")
minutos = readLine()!!.toInt()
print("Segundos:")
segundos = readLine()!!.toInt()

        while (finalizar==0){  

             Thread.sleep(1000)
             println("\u001Bc ")
             segundos-- 

            //Impresion mientras se va ejecutando el ciclo while

            println(String.format("%02d : %02d : %02d ", horas,minutos,segundos))  

            if (horas==0 && minutos == 0 && segundos== 0){
                finalizar = 1
            }
             if (minutos==0 && segundos==0) {
                horas--
                minutos=59
                
            
            }
            if(segundos==0 ) {
                 minutos--
                segundos=60
            }

        }
              Thread.sleep(500)
                println("\u001Bc ")
          print("Termino el conteo.")
                
}
      


