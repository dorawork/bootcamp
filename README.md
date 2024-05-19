Quiz3
implemnts 未清楚

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

Atomicity -> 原子性 安全 慢

stringbuilder - > 捉隻STRING不停放野入去

-「屬性」（attributes）對於一個名為「Person」的類別，它的屬性可以包括「姓名」、「年齡」、「性別」等。
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
       MySQL
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

       # Write your MySQL query statement below

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