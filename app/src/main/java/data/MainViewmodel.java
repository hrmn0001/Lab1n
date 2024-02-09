package data;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class MainViewmodel {
    public MutableLiveData<Boolean> isSelected= new MutableLiveData<>();

    // Constructor or any initialization method where you set initial value
    public MainViewmodel() {
        isSelected.setValue(false); // Set initial value
    }
}
