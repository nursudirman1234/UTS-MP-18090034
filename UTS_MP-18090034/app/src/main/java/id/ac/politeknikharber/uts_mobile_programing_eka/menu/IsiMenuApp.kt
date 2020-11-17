package id.ac.politeknikharber.uts_mobile_programing_azam.menu

import id.ac.politeknikharber.uts_mobile_programing_azam.R

object IsiMenuApp {
    private val foto = intArrayOf(
        R.drawable.calculator,
        R.drawable.information,
        R.drawable.cancel
    )
    private val nama = arrayOf(
        "Calculator",
        "information",
        "Close"
    )

    val data:ArrayList<MenuApp>
        get() {
            val listGambar:ArrayList<MenuApp> = arrayListOf()
            for(i in foto.indices){
                val menuApp = MenuApp()
                menuApp.foto = foto[i]
                menuApp.nama = nama[i]
                listGambar.add(menuApp)
            }
            return listGambar
        }
}