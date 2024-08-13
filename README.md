
implemnts 未清楚
extend  擴展都要ID NUMBER
abstract class 不可以NEW
stream add / remove***
spring -> DI autowired, ioc container spring container beans

conpile 時 mechanical code  / 先人睇 要轉多一層 java scrpit
strong type / type 無限制

interface - 合約
- collection最頂層
可以new arraylis 放collection
左手邊指針list只可以放arraylist , 不能放hashset限制給我們的東西
寬:  LIST 只可以用 LIST METHOD多D 有GET, linkedlist/ arraylist
窄 : collection 比list set 小 指針 List /queue / hashset / arraylist, 可以用method 小了???唔明,set冇得get
Queue: 排隊->第一先買, 買完離開 ,method可以做
list :只可以 add & remove 隊尾, list array ,array 先可以index?? 有可能重複
LinkedList: 
Set :pesend 資料庫上東西datebase, 冇重複 REMOVE DUPLICATED

Map.add put 
Linked list 用複雜既method, 右邊決定底層  ARRAY?LINKEDLIST?  係入面搵野  while loop 
List 使用.add + remove
*****
Thread-safe
concurrent 同時間
*****

synchronized - 關鍵字的主要目的是避免多個線程同時訪問共享的資源
public synchronized void testMethod() {
    // 這個方法在同一時間只能被一個線程執行
    // 方法內的代碼需要保證對共享資源的互斥訪問
}

Atomicity -> 原子性 安全 慢

stringbuilder - > 捉隻STRING不停放野入去

-「特徵」（attributes）對於一個名為「Person」的類別，它的屬性可以包括「姓名」、「年齡」、「性別」等。
object reference -> object address 空指針


     - type 轉變
    // int -> Integer (autobox)
    // integer -> int (unbox)
    // int -> long (upcast)
    // long -> int (downcast -> overflow)

    // Wrapper Class cannot be coverted between each others
    // Integer -> Long (No auto or direct relationship)
    // Long -> Integer (No auto or direct relationship)

    -常用詞彙
    concat 字串連接
    Object reference = 指針 地址
    
    -Exception
    -IllegalArgumentException //別人傳遞參數是負數 出現問題
    -ArithmeticException //數字運算上 數學運算 除 0 出現問題
    -ArrayIndexOutOfBoundsException // Array陣列出 出現問題
        excaption 幾時 throw try?
        原method try 再throw
        check exception 簽名 throw 出去 comp 成功
        另一個方法
               optional -> find first? 搵唔到?
        
       - 工具
       isEmty 
       queslof

       - Stream
       - .filter(e -> e % 2 == 1 && e > 100) //
       - .collect(Collectors.toList());
       - .count()

       轉換因為要使用Stream
       //arrays -> list
       - Arrays.asList(strings); //fixed size list arrays

       //list -> array
       - String[] arr = startsWitha.stream()//  stream -> 轉array
       - .toArray(s -> new String[s]);

            問題
           //1. filer salary >= 60000 and department = "IT"
           //2. map the name of th result set to a list of String

       -- .filter(e -> e.getAmount() < 1000); //條件 e的amount內是 < 1000
       -- .sorted()
       --  找String 內的詞彙是 "IT".equals  (e.getDepartment()) e 的department裡面
       -- .map(e -> e.getName()) 找MAP裡的名稱
       -- .concat (合拼)
       -- .compareToIgnoreCase 比較英文字次序
       -- .collect (Collectors.toList()); 收尾
-----------------------------------------------------------
       flattendList & Map
       改變結構 e.size
       變 1個
------------------------------------------------------------
       Factory Pattern / Builder Pattern



---------------------------------------------------------------
       Thread (不安全) 快 & 慢 1條KEY 1個人入鎖門再出, 全部人入唔洗鎖門
       ArrayList -> List 
       -- synchronized (保护共享资源) 功能鎖門
       -- try // 有JOIN先行, 最後行MAIN
       -- .join();

       USD 簡寫 更改時唔洗太多

       --------------------------

       non-relational model 

       超市購物車
       信用卡找數後結餘
       客投訴 / 資產損失 -> databases
       快 cookies /mobre
       跨sever update, 儲蓄戶口 -> 信用卡
       另一條team確認後, 再找
       ascending（升序）和descending（降序）
       driver 需要太多時間 會慢

       ----------------------------
# Write your MySQL 實用例子

       inner join  left right
       one to many
       one = primary key 獨一無二 (重複)
       many = foreign key 可以重複, 
       點解要加FOREIGN KEY 如果冇104
       先customer才有order
       order所以要有 
       ***見工問foreign key 防守 保持數據 ** 價值
       創建 department <- employee <-- 員工
       UNIQUE 規矩

       distinct 消除重複的資料 查詢唯一值 資料清理 一致性和準確性
       COUNT() → This function returns the number of rows.
       exists 只可以 p  #6 note 要放key = where 放條件
       那個product買, for loop 想法
       inner join 分別 p / o 找共同存在的
       group by  用佢行頭分類

# Write your MySQL 實用例子

select u.name, sum(t.amount) as balance 選擇 U 名, T $$
from users u inner join Transactions t on u.account = t.account   兩個ACCOUNT一樣 JOIN左先
group by u.account -- 分一個ACCOUNT GROUP
having sum(t.amount) >10000 在GROUP類拿 > 10000
T 全部AMOUNT 一樣的相加, 再加GROUP拿出來
order by  順次序
foreign key 
primary key 
auto_increment 自動順序, 不可以重複

在倉上找SELL - BUY 
select stock_name, sum(if(operation ='sell', price ,-price)) as capital_gain_loss
from stocks
group by stock_name 按照這行分類
where -- 使用條片
-- CTE

SELECT 列名
FROM 表名
WHERE 條件表達式;
"constraint"（約束）
email varhar(100) unique EMAIL不可以重複

select name
from employee
where id in(
    select managerid
    from employee
    group by managerid
    having count(*)>=5
)

redundancy and inconsistency
"（冗余）"（不一致）是

with dept_highest_salary as (
    select e.departmentId, max(e.salary) as max_salary
    from employee e
    group by e.departmentId
)
select d.name as Department, e.name as Employee, e.salary as Salary
from employee e
    inner join dept_highest_salary h on e.departmentId = h.departmentId
    inner join department d on d.id = e.departmentId
where e.salary = h.max_salary
;

# Write your MySQL 實用例子

with un_banned_list as(  //262
    select * 找出冇banned 用戶 + data
    from trips t join users u on t.client_id = u.users_id 
    where u.banned = "NO" and
     t.request_at between str_to_date('20131001', '%Y%m%d') and str_to_date('20131003', '%Y%m%d')

), total_request_list as( 全部單 count數量
    select request_at, count(1) count
    from un_banned_list
    group by request_at

),cancelled_requests as ( 取消左單
    select request_at, count(1) as count
    from un_banned_list
    where status in ('cancelled_by_driver', 'cancelled_by_client')
    group by request_at
)

# Write your MySQL 實用例子 全部單 / 取消單
select t.request_at as 'Day', round(ifnull(c.count, 0) / t.count, 2) as 'Cancellation Rate'
from total_request_list t left join cancelled_requests c on t.request_at = c.request_at;

# Write your MySQL 實用例子 計CANCAL ORDER
如果 canncel order是 ifnull = 0 / total order 
select t.request_at as 'Day', round(ifnull(c.count, 0) / t.count, 2) as 'Cancellation Rate'
from total_requests t left join cancelled_requests c on t.request_at = c.request_at;

# Write your MySQL 實用例子
COALESCE(SUM(r.distance), 0)  最優先的值
FROM Users u
LEFT JOIN Rides r ON u.id = r.user_id
GROUP BY u.id, u.name (如果冇ID 名一樣 , ID 唔一樣都可以出到)
ORDER BY travelled_distance DESC, 數字排大細 u.name ASC; 排英文字

# Write your MySQL query statement below 例子 : 選擇兩個最後的項目 
SELECT id,COUNT(id) AS num FROM
(SELECT requester_id AS id FROM RequestAccepted
UNION ALL
SELECT accepter_id AS id FROM RequestAccepted) AS derived_table
GROUP BY id
ORDER BY COUNT(id) DESC
LIMIT 1


# MySQL query statement below

main animal
pig->
small->pig

JAVA = COMPLIE LACHTION

week 8

格式

@AllArgsConstructor
@RequiredArgsConstructor

public class Student {
  @Getter
  @NonNull
  private String name;
  @Setter
  private int age;}

  TEST Core 同時兩個人做 , 後補TEST CASE 
  main 加 method for test 試
  day 2 maintreen維修 2000class / test case 加新野要全部試 2000class都要試
  it用科學技術全部試一次 test case  maven
  main core 理解

  git clone + 網站

for loop 順數字排
   int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

          test後面有tester伶一次都執行一次行為
          per_class 同一隻TEST
          per_method 不同TEST 多intastant method


@BeforeAll 和 @BeforeEach 在 JUnit 5 Jupiter 中的區別如下：

執行時機點：

@BeforeAll：在所有測試方法之前執行一次。這個方法必須是靜態方法。
@BeforeEach：在每個測試方法之前執行。這個方法可以是實例方法。
執行次數：

@BeforeAll：僅執行一次，用於全局初始化操作。
@BeforeEach：每個測試方法執行前都會執行一次，用於每個測試方法的初始化操作。
方法修飾符：

@BeforeAll：可以是 public、protected 或 package-private，但不能是 private。方法必須是靜態的。
@BeforeEach：可以是 public、protected 或 package-private，但不能是 private。
靜態性：

@BeforeAll：必須是靜態方法，因為它在測試類實例化之前就執行。
@BeforeEach：可以是實例方法，因為它在每個測試方法之前執行。

Dependency
method a -> b 要injected mockito 用途
calculator (int x , Cat cat) 共生關系
dpudtion c ijtion
要用obeject 比別人比我地
this.cat.sum(this.x, 10) +3
main cat 一定要存在
if (cat == null)
throw 走 

Mock cat冇行為, 可以加上去
Spy 有只cat,



letcore 1193 sql ctewith

select date_format(trans_date, '%Y-%m') AS month, country,
count(id) as trans_count,
sum(case when state = 'approved'then 1 else 0 end) as trans_count,
sum(amount) as trans_total_amount,
sum(CASE WHEN state = 'approved' THEN amount ELSE 0 END) as approved_total_amount
from Transactions 
group by month, country


## Spring code

電台 8080 del左 mvn spring-boot:run
API 承受幾多, 壓力測試annotated 


@ComponentScan: before application starts
1. scan all class (controller, serice repository configuration)
2. new @controller, class -> spring will create object for controller put it into spring context
3. client call api, spring defined class, spring will object from spring context call instacne method
每個所有client call api 都係用同一隻object / 新object call instance method = 冇分別
用不同方法手機call api 或 object  都係一樣, 因為object 冇attributes 行為 (this)
只係read 冇write 因為冇attributes 冇狀態

用SYSTEM OUT CHECK BUG

序列化 = SALIALIZATION
非object -> object Desritztion 反序列化

如果有//@Configuration  正常不能行
但如果加了  @Autowired (reqired = false) private AppConfig appConfig;

Configuration 跟往佢行
有兩個HELLO 都可以繼續行

 @Override
  public String testSayHello(){
    return new AppConfig().sayHello();
  }

  @Override
  public String testSayHello2(){
    return appConfig.sayHello(); // 正常出NA
  }  變了出HELLO

@Bean  = Object

@Configuration -> @Controller
@Autowired 
/ AppConfig / Spring contest
testcontori, contorller 需要有 dependencies關系 , 空指針 

Bean what is bean object 通過 autowired 拎黎用 建立唔係run 控制, sever start前已完成
與new分別, new object (local object) 曾經出現過 method行完會冇

Controller object 無狀態 = bean --> Spring contest (伺服器有限 restart就冇)
spring boot 接requirt 再過第2度
ebanking 10分鐘自動 login 記錄狀態, 計時間, 儲在database ,cloud

100隻貓 100隻不同狀態 不同valus (date) 不應該bean table 擁有 找cat database 不關spring constest事

new 冇需要, 因果關系 
JVN

DTO
可以唔公開

XML
Ojbect mode --> tree 關系 one to many / one to one
<character>
描述和儲存資料
平衡狀態DEFIND左FILE

MockBean, 空的Bean (假)

SpyBean, 外加object

SpringBootTest (直接行程序, 不用再加Bean)


## Json
-application servcer位置一定要岩
-Controller 行完先 (value =" v5") 次序-> 
-Opeaetor (value = "/jsonplaceholder/users")
-Userserivceimpl 
-@Value(value = "${api.json-place-holder.domain}")//required=true
-private String domain;
-@Value (value = "${api.json-place-holder.endpoints.users}")
-private String usersEndpoint;


## domain
-end
-List 唔會分類, 只順序 , 快
-hashmap, map = 順序 key color, value cat, 慢
-API 即時傳送資料 互相CALL

## Redis 減輕DB WORKLOAD, 數據時效 *ca* 急要性CSEE打 (最多delay)
-use expable 期待
-Java read write
-database select -> add
-java !-> select -> add
-自動會分流程

-photo video -> 搶DB資源 另一個Service
-JB -> DB 要網路
-API接口 ->? 對外 DB?
-冇API唔會出去 ->
-先觀察有冇RED->GET->問DB-> KEY STRING GET KEY  (GET USER)封裝
-Redis 只有 insert
-DB update 
-"CAP" 
-select 問題 ->
-Backup
-read + write / read or write 讀寫分離 重要性
-java design ->library 長d
-cloud -> software / 硬件/軟件
-mavan -> library 交換
-jpa -> 

## AWS Service seting
-EX2 Instance = object (熄機!=關Service)
-AMI = Images 模
-ip固定結構=租死1台機(aws不能霸死一隻) Dedicated Hosts
-TPS 1秒 10 trasftion (股票/strong) -> 寫落DATATBASE
-QPS -> READ -> create indesk 提升速度
-
-
-

website con data: demo-thymeleaf
http://localhost:8100/coin

##Stringbuilder ->修改自己 THIS
JVM

put 冇資料
post 永遠都會create

uley key
----------------------------------------------
## Spring boot
-Compiler在JAVA check
-compile時 check server start看一下邊到有SpringBootapplication然後CompenonentScan找以下 Controllor -> spring context
-@SpringBootapplication
-@CompenonentScan > @Componet @ Controllor(interface) @ Serivce(interface)  @ Configuration
//@Controller 控制: 用係@GetMapping @PostMapping
//@Service : 只係SERVICE LAYER 冇意思
// @Configuration: always use class in the config folder
// @Repository: conllect with DB JPA
-@Bean (左手交右手 static method: return a + b, 產生不同的object)
-@Autowired (有object才可以start service 自動裝配 Bean 依賴)
準備好Controller裡的bean(object才可以行service)
前面整service前 熄intert mvn clean test

serivce後 有intert install 測試邊個部份有問題
@Gettmapper (value) @Postmapper
@接api
@RequestParm, @PathVarible
@JsonProperty (DTO) -> 出街
@RestContoller (@Controller + @ResponseBody)
@PostConstruct (right after bean creation, before the sever start completed)
@RestControllerAdvice (@ControllerAdice + @ResponseBody)
@ExceptiionHandler
@SptingBootTest, 2wEBmVCtEST, @MockBean, @ SpyBean
@Value

## Lombok
@data(@toString, @requiedargsconstructor, @getter , @setter)
@getter
@setter
@allargsconstructor
@noallargsconstructor
@tostring
@equalandhashcode

## OTHER
- Custom Libraries (Infra folder)
- ApiResp.class
- UrlBuilder.class
- BusinseeRuntimeEXception.class

- Mockito, Junit5, (test case)
- @Mock, @Spy, @InjectMock, @BefreAll, @BeforEACH

## Spring boot vs Java
- SpringContext (Bean) Dependency Injection (DI & IOC) & Inversion of control (交比人new control)**
- Global exception handling (每個method都會觀察一次, 原路不翻回, Parent Concept Exception.class, runtime) **
- auto Deserialaization (JSON to Java Object) & Serialization (Java object to Json)
- application.yml
- Data Transfer Object ()