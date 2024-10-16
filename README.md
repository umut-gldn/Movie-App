# Movie App

Movie App, film tutkunları için geliştirilmiş modern bir Android uygulamasıdır. OMDB API'sini kullanarak geniş bir film veritabanına erişim sağlar ve kullanıcılara zengin bir film keşfetme deneyimi sunar.

## 🌟 Özellikler

- 🔍 Gelişmiş film arama
- 📋 Detaylı film bilgileri
- 🎨 Modern ve kullanıcı dostu arayüz
- 🚀 Hızlı ve akıcı performans

## 🛠 Kullanılan Teknolojiler

- **Kotlin**
- **MVVM**
- **Coroutines**
- **Flow**
- **Retrofit**
- **Dagger Hilt**
- **Coil**

## 🚀 Kurulum

1. Repoyu klonlayın:
   
2. `Constants.kt` dosyasını oluşturun ve şu içeriği ekleyin:
   ```kotlin
   object Constants {
       const val API_KEY = "sizin_api_anahtariniz"
       const val BASE_URL = "http://www.omdbapi.com"
       const val IMDB_ID="imdb_id"
   
   }
   ```
3. OMDB API'den aldığınız API anahtarını `API_KEY` değişkenine atayın.
4. Projeyi Android Studio'da açın ve çalıştırın.
