import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {
    // Внутрішнє збереження тексту
    private val _text = MutableLiveData("Початковий текст")

    // Зовнішній доступ до тексту
    val text: LiveData<String> get() = _text

    // Метод для зміни тексту
    fun changeText(newText: String) {
        _text.value = newText
    }
}
