## Протокол UAT (User Acceptance Testing) к веб сервису по обработке изображений
## Дата тестирования: [дата]

### Описание тестовых случаев:

#### Тест 1: перейти на страницу сервиса
Шаги:
- открыть браузер
- перейти на страницу сервиса

Ожидаемый результат:
- страница сервиса загрузилась, видно форму для загрузки изображения

#### Тест 2: выбор изображения для обработки
Шаги:
- нажать на кнопку выбора файла
- в открывшемся окне выбрать файл изображения

Ожидаемый результат:
- при нажатии на кнопку, открывается окно проводника, в котором можно выбрать файл
- после выбора окно проводника закроется и имя файла будет заполнено в форме на странице

#### Тест 3: загрузка изображения на сервер для обработки
Шаги:
- нажать на кнопку загрузить

Ожидаемый результат:
- появилась анимация загрузки файла, после загрузки стала активна кнопка "Обработать"

#### Тест 4: обработка изображения
Шаги:
- нажать на кнопку "Обработать"
- увидеть анимацию обработки
- в сплывающем окне получить ссылки на скачивание файлов, которые получились после обработки.

Ожидаемый результат:
- кнопка активна и нажалась
- после нажатия появилась анимация обработки
- появилось всплывающее окно с ссылками на скачивание файлов

#### Тест 5: проверка корректности изменений в скачанных файлах
Шаги:
- скачать файлы после обработки
- проверить результат обработки

Ожидаемый результат:
- файлы успешно загружены
- они открылись и результат соответствует обработке

### Фактические результаты:

#### Тест 1: перейти на страницу сервиса
- страница сервиса загрузилась, видна форма для загрузки изображения
#### Тест 2: выбор изображения для обработки
- изображение выбрано, и отображается в форме
#### Тест 3: загрузка изображения на сервер для обработки
- кнопка нажалась, была анимация загрузки
#### Тест 4: обработка изображения
- кнопка нажалась, была анимация обработки, открылось всплывающее окно с результатами обработки
#### Тест 5: проверка корректности изменений в скачанных файлах
- файлы загрузились, результаты обработки соответствуют

### Статус тестирования:
- Тест 1: перейти на страницу сервиса - пройден успешно
- Тест 2: выбор изображения для обработки - пройден успешно
- Тест 3: загрузка изображения на сервер для обработки - пройден успешно
- Тест 4: обработка изображения - пройден успешно
- Тест 5: проверка корректности изменений в скачанных файлах - пройден успешно

### Комментарии и замечания:
- анимация загрузки без процентного соотношения, у пользователя нет понимания о прогрессе операции

### Дата и подписи:

Дата тестирования: [дата]

Подпись пользователя/клиента: ____________________________

Подпись тестировщика: ____________________________

Этот протокол включает более подробные описания тестовых случаев,
фактические результаты, статусы тестирования и комментарии от пользователей и тестировщика