[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=11015674)
# Практична робота "Поглиблене використання масивів"

Цей репозиторій містить iнструкції та стартовий код для виконання практичної роботи з теми.

## В рамках практичної роботи ви маєте зробити наступне:
1. написати клас, який містить методи для розв'язання обраного вами завдання та тестовий клас, який дозволяє перевірити його роботу. Класи мають міститись у теці ```src```. Не забуваємо про те, що основний клас **має бути універсальним, тобто він не містить інтерфейсу користувача - лише логіку (статичний метод), яка диктується завданням** (і можливо не всі його методи мають бути публічними)!
2. методу ```main``` тестового класу **не може містити ніякої логіки, пов'язаної з виконанням завдання** - лише перевіряти працездатність основного класу!
3. **README.MD репозиторію має містити опис обраного вами завдання** (краще - з картинками та форматуванням :blush:)!
4. **УВАГА!** Не слід вважати, що завдання дуже прості! Вам необхідно подбати про:
    * **оптимізацію програми - обрати оптимальні з точки зору обсягу використовуваної пам'яті типи даних**
    * **іменування змінних і констант у відповідності до рекомендацій**
    * **javadoc-коментарі для основного класу, які пояснюють що саме обчислюється і які вихідні дані для цього потрібні**
5. завдання намагаємось виконувати **без циклів - з використанням класу ````Arrays````** (див. відеолекцію, та приклад, який я там розв'язав)
6. здати завдання. **Нагадую, що здаючи завдання через Google Classroom, слід вказати посилання на створений для вас репозиторій!**

**P.S.** Ви можете обрати завдання на власний розсуд - реалізувати алгоритм, який вас зацікавив, однак якщо буде надто багато однакових класів, завдання не буде зараховано - намагайтесь робити самотужки та у власному стилі! Звісно ж, ніхто не забороняє користуватись Інтернетом, шукати й використовувати знайдене у Мережі!

----

## Список завдань
1. Заповніть квадратну матрицю заданого порядку N простими числами з вказаного діапазону і виведіть її.

   *В цьому коді використовуються такі 3 основних метода:*
- ````generatePrimeMatrix```` - цей метод створює матрицю і заповнює її простими числами. Він використовує метод ````getPrimes````, щоб знайти всі прості числа у вказаному інтервалі, та потім повертає матрицю з заповненими значеннями простих чисел.
- ````getPrimes```` - цей метод знаходить всі прості числа між ````min```` та ````max````, використовуючи метод ````isPrime````, який перевіряє, чи є число простим.
- ````isPrime```` - цей метод перевіряє, чи є число простим, використовуючи просту алгоритмічну перевірку: перебір всіх чисел від 2 до кореня з числа, та перевірка, чи ділиться воно на якесь з цих чисел без остачі.
У методі ````main```` використовується ````generatePrimeMatrix```` для створення матриці та виведення її елементів на екран з використанням ````System.out.println````.

*Опис програми:*

Я створив головний метод, який викликається при запуску програми, в якому він вказує порядок матриці, мінімальне та максимальне значення для простих чисел, які будуть знаходитись у матриці. Метод ````generatePrimeMatrix```` генерує матрицю з використанням методу ````getPrimes````, який повертає масив простих чисел, які потім заповнюють матрицю. Метод ````isPrime```` перевіряє, чи є число простим.

У методі ````main```` я використовував цикл ````for```` для виведення кожного рядка матриці на екран. Метод ````Arrays.toString````` використовується для форматування виведення рядків матриці. Всі методи є статичними, що означає, що їх можна викликати без створення об'єкта класу.

Якщо узагальнити я створив програму для генерації матриці з простих чисел, яка виводиться на екран. Програма демонструє використання циклів, методів та масивів на мові програмування Java.
