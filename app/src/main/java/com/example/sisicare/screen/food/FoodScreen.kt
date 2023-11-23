import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.sisicare.screen.food.FoodScreenViewModel

@Composable
fun FoodScreen(
    viewModel: FoodScreenViewModel,
    navController: NavController
){
    Text(text = "Food")
}