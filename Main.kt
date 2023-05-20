import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment

@Preview
@Composable
fun App(name:String) {
    /*Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier=
        Modifier.background(Color.Black)
            .size(400.dp)
    )
     */
    /*Row(
        horizontalArrangement = Arrangement.End,
    )
     */
    Box(
        modifier = Modifier
            .size(400.dp),
        contentAlignment= Alignment.Center
    )
    {

        Text(
            color = Color.Blue,
            fontSize= 30.sp,
            /*modifier= Modifier
                .background(Color.Magenta)
                .padding(16.dp)
                .background(Color.Gray),
                */
            text="hola $name",
            modifier = Modifier
                .align(Alignment.BottomEnd)
            //modifier = Modifier.fillMaxSize()
        )
        Text(
            color = Color.Blue,
            fontSize= 30.sp,
            /*
            modifier= Modifier
                .background(Color.Magenta)
                .padding(16.dp)
                .background(Color.Gray),
             */
            text="Me pican los cocos"
        )
    }

}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App("bb")
    }
}
