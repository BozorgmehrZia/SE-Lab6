# SE-Lab6
## مستندات آزمایش 6 مهندسی نرم افزار

پاسخ سوالات:

1.
- الگوهای طراحی سازنده (Creational Design Patterns): این الگوها الگوهای طراحی هستند که با مکانیسم های ایجاد اشیا سروکار دارند و سعی می کنند اشیا را به شیوه ای متناسب با موقعیت ایجاد کنند. شکل اصلی ایجاد شی می تواند منجر به مشکلات طراحی یا افزودن پیچیدگی به طراحی شود. الگوهای طراحی سازنده این مشکل را با کنترل ایجاد این شیء حل می کنند.
- الگوهای طراحی ساختاری (Structural Design Patterns): این نوع الگو طرحی است از نحوه ترکیب اشیاء و کلاس‌های مختلف برای تشکیل ساختار بزرگ‌تری برای دستیابی به اهداف متعدد. این الگوها نشان می‌دهند که چگونه قطعات منحصربه‌فرد یک سیستم را می‌توان به شکلی قابل توسعه و انعطاف‌پذیر با هم ترکیب کرد. بنابراین، با کمک این الگوها می‌توانیم بخش‌های خاصی از ساختار را بدون تغییر کل ساختار مورد هدف قرار داده و تغییر دهیم.
- الگوهای طراحی رفتاری (Behavioral Design Patterns): این دسته، الگوهای ارتباطی مشترک بین اشیاء را شناسایی کرده و این الگوها را تحقق می بخشند. با انجام این کار، این الگوها انعطاف پذیری را در انجام این ارتباط افزایش می دهند.

2.الگوهای طراحی رفتاری

3.
برای پاسخ دادن به سوال کاربران در این سیستم اطلاع‌رسانی، بهترین الگوی طراحی که می‌توان استفاده کرد، الگوی "State" است. در این سیستم، وضعیت یا حالت (State) مسیرها می‌تواند به صورت یک‌طرفه یا دوطرفه باشد. الگوی State به شما اجازه می‌دهد که رفتار یک سیستم را بر اساس وضعیت فعلی آن تغییر دهید، بدون نیاز به تغییر ساختار کلاس‌ها یا منطق داخلی آن.

چرا الگوی State مناسب است؟
- تغییر حالت پویا: در سیستم مورد نظر، مسیرها ممکن است بین حالت‌های یک‌طرفه و دوطرفه تغییر کنند. الگوی State امکان تغییر دینامیک وضعیت سیستم را به راحتی فراهم می‌کند.
- ساده‌سازی منطق: با استفاده از الگوی State، می‌توانید منطق مربوط به هر حالت را در کلاس‌های جداگانه پیاده‌سازی کنید. این باعث می‌شود کد خواناتر و قابل نگهداری‌تر باشد.
- افزایش قابلیت توسعه: اگر در آینده نیاز به اضافه کردن حالت‌های جدید یا تغییر رفتار فعلی باشد، الگوی State به شما این امکان را می‌دهد که به راحتی این تغییرات را اعمال کنید بدون این که بر سایر بخش‌های سیستم تاثیر بگذارد.

نحوه تحقق الگو

4.
- اصل SRP: این اصل مسئولیت واحد را نقض می کند. این الگو دو مشکل را حل می کند (اطمینان از اینکه یک کلاس فقط یک نمونه دارد و ارائه تنها یک مکان برای دسترسی به آن).
- اصل OCP: برای اینکه یک کلاس open باشد، باید امکان ارث بردن از آن وجود داشته باشد. وراثت یک رابطه "is-a" است. اگر از یک کلاس singleton به ارث می برید، نمونه هایی از کلاس فرزند نیز به دلیل رابطه "is-a" نمونه هایی از کلاس والد هستند، به این معنی که می توانید ناگهان چندین نمونه از کلاس singleton داشته باشید. اگر کلاس singleton از وراثت جلوگیری کند، دیگر open نیست. اگر یک کلاس singleton اجازه وراثت را بدهد، و برای گسترش open باشد، دیگر نمی تواند الگوی singleton را اجرا کند.
- اصل LSP: خود الگوی Singleton ذاتاً اصل جایگزینی Liskov را نقض نمی کند. با این حال، پیاده سازی الگوی Singleton گاهی اوقات می تواند منجر به مسائلی شود که ممکن است به طور غیرمستقیم با LSP در تضاد باشد، اگر با دقت طراحی نشود (مانند مورد قبلی).
- اصل ISP: الگوی Singleton خود ذاتاً اصل جداسازی رابط را نقض نمی کند (اگر رابط طراحی ضعیفی داشته باشد، ممکن است نقض شود). بنابراین می‌توانیم یک پیاده‌سازی اینترفیس Singleton داشته باشیم که تنها دارای یک تابع به نام getInstance در کنار برخی از اینترفیس‌های دیگر است که سعی در پیاده‌سازی برخی ویژگی‌های دلخواه دارند.
- اصل DIP: لزوماً اصل وارونگی وابستگی را نقض نمی کند، اما مانند مورد آخر، اگر طراحی ضعیفی داشته باشد، می تواند نقض شود. در واقع الگوی طراحی Singleton هیچ پیچیدگی و هیچ تلاقی با نحوه ارتباط کلاس های پیاده سازی شده با کلاس های دیگر ندارد.

5.
- کد تمیز: کدی که خوانا، قابل فهم، ساده، و به راحتی قابل نگهداری و توسعه باشد.
- بدهی فنی: مشکلات و نقص‌های کد که به دلیل تصمیمات سریع یا نادرست فنی ایجاد می‌شوند و نیاز به بازبینی و اصلاح دارند.
- بوی بد: نشانه‌هایی در کد که حاکی از مشکلات طراحی یا کیفیت پایین کد است و نیاز به اصلاح یا بهبود دارد.

6.

طبق دسته‌بندی وب‌سایت Refactoring.Guru، بوهای بد کد به پنج دسته تقسیم می‌شوند:

- بوهای بد در کلاس‌ها (Bloaters): این دسته شامل مشکلاتی است که ناشی از بزرگ شدن بیش از حد عناصر کد مانند کلاس‌ها و توابع می‌شوند. به عنوان مثال، کلاس‌های خیلی بزرگ (Large Class) یا توابع خیلی طولانی (Long Method) که به دلیل انجام کارهای بیش از حد پیچیده، مدیریت و درک کد را دشوار می‌کنند.
- بوهای بد در ساختارهای شرطی (Object-Orientation Abusers): این دسته شامل مشکلاتی است که به دلیل سوءاستفاده یا نادیده گرفتن اصول شی‌گرایی رخ می‌دهند. به عنوان مثال، پلی‌مورفیسم جایگزین شرط‌ها (Replace Conditional with Polymorphism) که به جای استفاده از چندریختی، از شرط‌های پیچیده استفاده می‌شود.
- بوهای بد در رابطه بین کلاس‌ها (Change Preventers): این دسته شامل مشکلاتی است که تغییرات در یک بخش از کد را به دلیل وابستگی زیاد بین کلاس‌ها دشوار می‌کنند. به عنوان مثال، وابستگی‌های پیچیده (Inappropriate Intimacy) که در آن کلاس‌ها بیش از حد به یکدیگر وابسته هستند.
- بوهای بد در کتابخانه‌ها و پکیج ها (Dispensables): این دسته شامل کدهایی است که غیرضروری هستند و می‌توان آنها را بدون تاثیر منفی حذف کرد. به عنوان مثال، کدهای مرده (Dead Code) که در پروژه استفاده نمی‌شوند یا کلاس‌های داده‌های بی‌خاصیت (Data Class) که فقط داده‌ها را نگهداری می‌کنند و هیچ رفتار مرتبطی ندارند.
- بوهای بد در معماری و طراحی کلی (Couplers): این دسته شامل مشکلاتی است که به دلیل طراحی ضعیف در ارتباطات بین ماژول‌ها یا کلاس‌ها به وجود می‌آیند. به عنوان مثال، وابستگی‌های متقابل (Feature Envy) که در آن یک کلاس بیش از حد به داده‌های کلاس دیگری وابسته است.

7.
بوی بد Lazy Class (کلاس تنبل) در دسته‌ی Dispensables قرار می‌گیرد. این دسته شامل کدهایی است که غیرضروری یا زائد هستند و می‌توان آن‌ها را بدون تأثیر منفی حذف کرد.

برای برطرف کردن بوی بد Lazy Class، می‌توان از این بازآرایی‌ها (Refactorings) استفاده کرد:

- Inline Class: در صورتی که یک کلاس وظایف محدودی دارد و تنها نقش یک واسطه را بازی می‌کند، می‌توانید آن را با درون‌سازی در کلاس دیگری که استفاده اصلی از آن می‌شود، ادغام کنید.
- Collapse Hierarchy: اگر کلاس موردنظر بخشی از یک سلسله مراتب است که عملکرد خاصی ندارد، می‌توان آن را با کلاس والد یا فرزند ترکیب کرده و سلسله مراتب را ساده‌سازی کرد.

مواقعی که باید نادیده گرفته شود:
-   در حال توسعه: اگر کلاس هنوز در حال توسعه است و قرار است در آینده عملکرد بیشتری به آن افزوده شود، ممکن است لازم باشد این بو را نادیده بگیرید.
-   ساختار کلی معماری: اگر کلاس به دلیل ساختار معماری خاصی وجود دارد و حتی اگر فعلاً وظایف محدودی دارد، ممکن است برای جلوگیری از پیچیدگی‌های آینده نادیده گرفته شود.
-   پیش‌بینی برای گسترش آینده: اگر پیش‌بینی می‌شود که کلاس به زودی نقش مهم‌تری در سیستم ایفا کند، می‌توان موقتاً آن را حفظ کرد.

8.
- Large Class: `Main` class
- Long Method: Method `loopOnGUI` in class `Main`
- Dead code: In method `generateInfoForXML` in class `Main`
- Speculative Generality: Variable `phase2` in method `main` in class `Main`
- Duplicate Code: Methods `setDataByNode` in classes `ClassConstructor` and `ClassMethod` have duplicate codes
- Switch Statements: Complex switch operator in method `generatePhase2` in class `Phase2CodeFileManipulator`
- Inappropriate Intimacy: Method `loopOnGUI` of class `Main` is using internal class `RealFunction` of class `MethodOverloader`
- Data Class: Class `DependencyEdge`
- Message Chains: In class `ClassMethod` line 88
- Feature Envy: Class `GUIClass` uses fields of class `Main`

9.
پلاگین `formatter-maven-plugin` یک پلاگین برای ابزار Maven است که به منظور فرمت و قالب‌بندی کدهای جاوا استفاده می‌شود. این پلاگین به صورت خودکار کدهای منبع را مطابق با قواعد و استانداردهای مشخص‌شده قالب‌بندی می‌کند.

وظایف و قابلیت‌ها:
- قالب‌بندی خودکار کد: این پلاگین می‌تواند کدهای جاوا را بر اساس تنظیمات مشخص شده (مانند فرمت‌بندی برای فاصله‌ها، تورفتگی‌ها، خطوط خالی و غیره) به صورت خودکار قالب‌بندی کند.
- یکپارچگی فرمت کد: با استفاده از این پلاگین، تمام کدهای پروژه به طور یکسان قالب‌بندی می‌شوند، که باعث می‌شود تیم توسعه بتواند از یک سبک کدنویسی واحد پیروی کند.
- قابلیت اجرا به صورت خودکار: این پلاگین می‌تواند به عنوان بخشی از فرآیند ساخت (build process) اجرا شود و اطمینان حاصل کند که کدها قبل از کامپایل یا انتشار، مطابق با استانداردهای مشخص‌شده قالب‌بندی شده‌اند.

چرا می‌تواند کمک‌کننده باشد؟
- افزایش خوانایی و نگهداری کد: قالب‌بندی منظم کد باعث می‌شود که کدها خواناتر و قابل‌فهم‌تر باشند، که این موضوع نگهداری و توسعه‌ی آن‌ها را ساده‌تر می‌کند.
- کاهش تضادها در کنترل نسخه: وقتی کدها به صورت یکپارچه قالب‌بندی شوند، احتمال بروز تضادها (conflicts) در سیستم‌های کنترل نسخه (مانند Git) کاهش می‌یابد.
- حفظ یکنواختی کد در تیم‌های بزرگ: در پروژه‌های با تیم‌های بزرگ، استفاده از یک قالب‌بندی مشترک به جلوگیری از اختلافات در سبک کدنویسی کمک می‌کند.

رابطه با بازآرایی کد (Refactoring):
بازآرایی کد شامل تغییر ساختار کد بدون تغییر رفتار آن است. در این فرآیند، بهبود ساختار داخلی کد و بهبود خوانایی و سادگی آن هدف اصلی است.

- کمک به شناسایی نیاز به بازآرایی: زمانی که کد به خوبی قالب‌بندی شده و خواناست، شناسایی نیاز به بازآرایی کدهای پیچیده، تکراری یا بدساختار ساده‌تر می‌شود.
- پیاده‌سازی بازآرایی‌ها: پس از بازآرایی کد، قالب‌بندی مناسب با استفاده از این پلاگین می‌تواند تضمین کند که کد بازآرایی‌شده همچنان خوانا و منظم باقی بماند.

بنابراین، `formatter-maven-plugin` به عنوان یک ابزار مکمل می‌تواند به فرآیند بازآرایی کد کمک کند تا کد بازآرایی‌شده نه تنها بهینه‌تر، بلکه از نظر ظاهری نیز منظم‌تر و حرفه‌ای‌تر باشد.
