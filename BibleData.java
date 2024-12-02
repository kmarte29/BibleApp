import java.util.*;

public class BibleData
{
    //Method to initialize and return the HashMap of books and chapters
    public static HashMap<String, ArrayList<String>> initializeBooks()
    {
        HashMap<String, ArrayList<String>> books = new HashMap<>();

        //Data for Book of Matthew
        ArrayList<String> Matthew = new ArrayList<>();
        Matthew.add("The Genealogy of Jesus Christ");
        Matthew.add("Wise Men from the East");
        Matthew.add("John the Baptist Prepares the Way");
        Matthew.add("Satan Tempts Jesus");
        Matthew.add("The Beatitudes");
        Matthew.add("Do Good to Please God");
        Matthew.add("Do Not Judge");
        Matthew.add("Jesus Cleanses a Leper");
        Matthew.add("Jesus Forgives and Heals a Paralytic");
        Matthew.add("The Twelve Apostles");
        Matthew.add("John the Baptist Sends Messengers to Jesus");
        Matthew.add("Jesus is Lord of the Sabbath");
        Matthew.add("The Parable of the Sower");
        Matthew.add("John the Baptist is Beheaded");
        Matthew.add("Defilement Comes from Within");
        Matthew.add("The Pharisees and Sadducees Seek a Sign");
        Matthew.add("Jesus Transfigured on the Mount");
        Matthew.add("Who is the Greatest?");
        Matthew.add("Marriage and Divorce");
        Matthew.add("The Parable of the Workers in the Vineyard");
        Matthew.add("The Triumphal Entry");
        Matthew.add("The Parable of the Wedding Feast");
        Matthew.add("Woe to the Scribes and Pharisees");
        Matthew.add("Jesus Predicts the Destruction of the Temple");
        Matthew.add("The Parable of the Wise and Foolish Virgins");
        Matthew.add("The Plot to Kill Jesus");
        Matthew.add("Jesus Handed Over to Pontius Pilate");
        Matthew.add("He is Risen");
        //add Matthew to list of books
        books.put("MATTHEW", Matthew);

        //Data for Book of Mark
        ArrayList<String> Mark = new ArrayList<>();
        Mark.add("John the Baptist Prepares the Way");
        Mark.add("Jesus Forgives and Heals a Paralytic");
        Mark.add("Healing on the Sabbath");
        Mark.add("The Parable of the Sower");
        Mark.add("A Demon-Possessed Man Healed");
        Mark.add("Jesus Rejected at Nazareth");
        Mark.add("Defilement Comes from Within");
        Mark.add("Feeding the Four Thousand");
        Mark.add("The Transfiguration of Christ");
        Mark.add("Marriage and Divorce");
        Mark.add("The Triumphal Entry");
        Mark.add("The Parable of the Wicked Vinedressers");
        Mark.add("Jesus Predicts the Destruction of the Temple");
        Mark.add("The Plot to Kill Jesus");
        Mark.add("Jesus Faces Pilate");
        Mark.add("He Is Risen");
        //add Mark to list of books
        books.put("MARK", Mark);

        //Data for Book of Luke
        ArrayList<String> Luke = new ArrayList<>();
        Luke.add("Dedication to Theophilus");
        Luke.add("Christ Born of Mary");
        Luke.add("John the Baptist Prepares the Way");
        Luke.add("Satan Tempts Jesus");
        Luke.add("Four Fishermen Called as Disciples");
        Luke.add("Jesus Is Lord of the Sabbath");
        Luke.add("Jesus Heals a Centurion’s Servant");
        Luke.add("Many Women Minister to Jesus");
        Luke.add("Sending Out the Twelve");
        Luke.add("The Seventy Sent Out");
        Luke.add("The Model Prayer");
        Luke.add("Beware of Hypocrisy");
        Luke.add("Repent or Perish");
        Luke.add("A Man with Dropsy Healed on the Sabbath");
        Luke.add("The Parable of the Lost Sheep");
        Luke.add("The Parable of the Unjust Steward");
        Luke.add("Jesus Warns of Offenses");
        Luke.add("The Parable of the Persistent Widow");
        Luke.add("Jesus Comes to Zacchaeus’ House");
        Luke.add("Jesus’ Authority Questioned");
        Luke.add("The Widow’s Two Mites");
        Luke.add("The Plot to Kill Jesus");
        Luke.add("Jesus Handed Over to Pontius Pilate");
        Luke.add("He Is Risen");
        //add Luke to list of books
        books.put("LUKE", Luke);

        //Data for Book of John
        ArrayList<String> John = new ArrayList<>();
        John.add("The Eternal Word");
        John.add("Water Turned to Wine");
        John.add("The New Birth");
        John.add("A Samaritan Woman Meets Her Messiah");
        John.add("A Man Healed at the Pool of Bethesda");
        John.add("Feeding the Five Thousand");
        John.add("Jesus’ Brothers Disbelieve");
        John.add("Jesus the Light of the World");
        John.add("A Man Born Blind Receives Sight");
        John.add("Jesus the True Shepherd");
        John.add("The Death of Lazarus");
        John.add("The Anointing at Bethany");
        John.add("Jesus Washes the Disciples’ Feet");
        John.add("The Way, the Truth, and the Life");
        John.add("The True Vine");
        John.add("Jesus Warns and Comforts His Disciples");
        John.add("Jesus Prays for Himself");
        John.add("Betrayal and Arrest in Gethsemane");
        John.add("The Soldiers Mock Jesus");
        John.add("The Empty Tomb");
        John.add("Breakfast by the Sea");
        //add John to list of books
        books.put("JOHN", John);

// Data for Book of Acts
        ArrayList<String> Acts = new ArrayList<>();
        Acts.add("The Holy Spirit Promised");
        Acts.add("The Coming of the Holy Spirit");
        Acts.add("A Lame Man Healed");
        Acts.add("Peter and John Arrested");
        Acts.add("Lying to the Holy Spirit");
        Acts.add("The Choosing of the Seven");
        Acts.add("Stephen Accused of Blasphemy");
        Acts.add("Stephen’s Address: The Call of Abraham");
        Acts.add("Stephen the Martyr");
        Acts.add("Saul Persecutes the Church");
        Acts.add("Saul’s Conversion");
        Acts.add("Peter’s Vision");
        Acts.add("Peter Defends God’s Grace");
        Acts.add("Barnabas and Saul Appointed");
        Acts.add("Paul’s First Missionary Journey");
        Acts.add("The Jerusalem Council");
        Acts.add("Timothy Joins Paul and Silas");
        Acts.add("Ministry in Thessalonica");
        Acts.add("Ministry in Corinth");
        Acts.add("Journeys in Greece");
        Acts.add("Warnings on the Journey to Jerusalem");
        Acts.add("Paul Arrested in the Temple");
        Acts.add("The Plot Against Paul");
        Acts.add("Paul Appeals to Caesar");
        Acts.add("Paul’s Defense Before Agrippa");
        Acts.add("The Voyage to Rome Begins");
        Acts.add("Shipwrecked on Malta");
        Acts.add("Paul’s Ministry at Rome");
        books.put("ACTS", Acts);

        // Data for Book of Romans
        ArrayList<String> Romans = new ArrayList<>();
        Romans.add("Greeting to the Romans");
        Romans.add("God’s Wrath on Unrighteousness");
        Romans.add("God’s Righteous Judgment");
        Romans.add("Abraham Justified by Faith");
        Romans.add("Faith Triumphs in Trouble");
        Romans.add("Dead to Sin, Alive to God");
        Romans.add("Freed from the Law");
        Romans.add("Free from Indwelling Sin");
        Romans.add("Israel’s Rejection of Christ");
        Romans.add("Israel’s Future Salvation");
        Romans.add("Living Sacrifices to God");
        Romans.add("Submit to Government");
        Romans.add("The Law of Love");
        Romans.add("Bearing Others’ Burdens");
        Romans.add("Paul’s Ministry to the Gentiles");
        Romans.add("Sister Phoebe Commended");
        books.put("ROMANS", Romans);

        // Data for 1 Corinthians
        ArrayList<String> Corinthians1 = new ArrayList<>();
        Corinthians1.add("Greeting");
        Corinthians1.add("Christ the Power and Wisdom of God");
        Corinthians1.add("Sectarianism Is Carnal");
        Corinthians1.add("Stewards of the Mysteries of God");
        Corinthians1.add("Immorality Defiles the Church");
        Corinthians1.add("Do Not Sue the Brethren");
        Corinthians1.add("Glorify God in Body and Spirit");
        Corinthians1.add("Keep Your Marriage Vows");
        Corinthians1.add("Be Sensitive to Conscience");
        Corinthians1.add("Flee from Idolatry");
        Corinthians1.add("Worship and the Lord’s Supper");
        Corinthians1.add("Spiritual Gifts: Unity and Diversity");
        Corinthians1.add("The Greatest Gift");
        Corinthians1.add("Prophecy and Tongues");
        Corinthians1.add("The Resurrection of Christ");
        Corinthians1.add("Collection for the Saints");
        books.put("1 CORINTHIANS", Corinthians1);

        // Data for 2 Corinthians
        ArrayList<String> Corinthians2 = new ArrayList<>();
        Corinthians2.add("Greeting");
        Corinthians2.add("Comfort in Suffering");
        Corinthians2.add("Forgiveness for the Offender");
        Corinthians2.add("Christ’s Epistle");
        Corinthians2.add("Treasure in Earthen Vessels");
        Corinthians2.add("The Ministry of Reconciliation");
        Corinthians2.add("Marks of the Ministry");
        Corinthians2.add("The Cheerful Giver");
        Corinthians2.add("The Spiritual War");
        Corinthians2.add("Paul Defends His Apostleship");
        Corinthians2.add("Concern for Their Faithfulness");
        Corinthians2.add("The Signs of an Apostle");
        Corinthians2.add("Coming with Authority");
        books.put("2 CORINTHIANS", Corinthians2);

        // Data for Galatians
        ArrayList<String> Galatians = new ArrayList<>();
        Galatians.add("Only One Gospel");
        Galatians.add("Defending the Gospel");
        Galatians.add("Justification by Faith");
        Galatians.add("Sons and Heirs");
        Galatians.add("Christian Liberty");
        Galatians.add("Bear and Share the Burdens");
        books.put("GALATIANS", Galatians);

        // Data for Ephesians
        ArrayList<String> Ephesians = new ArrayList<>();
        Ephesians.add("Redemption in Christ");
        Ephesians.add("By Grace Through Faith");
        Ephesians.add("The Mystery Revealed");
        Ephesians.add("Walk in Unity");
        Ephesians.add("Walk in Love");
        Ephesians.add("Children and Parents");
        books.put("EPHESIANS", Ephesians);

        // Data for Philippians
        ArrayList<String> Philippians = new ArrayList<>();
        Philippians.add("Thankfulness and Prayer");
        Philippians.add("Christ’s Humility and Exaltation");
        Philippians.add("All for Christ");
        Philippians.add("Be United, Joyful, and in Prayer");
        books.put("PHILIPPIANS", Philippians);

        // Data for Colossians
        ArrayList<String> Colossians = new ArrayList<>();
        Colossians.add("Greeting");
        Colossians.add("Reconciled in Christ");
        Colossians.add("Not Legalism but Christ");
        Colossians.add("Character of the New Man");
        books.put("COLOSSIANS", Colossians);

        // Data for 1 Thessalonians
        ArrayList<String> Thessalonians1 = new ArrayList<>();
        Thessalonians1.add("Greeting");
        Thessalonians1.add("Their Faith and Example");
        Thessalonians1.add("Longing to See Them");
        Thessalonians1.add("Plea for Purity");
        Thessalonians1.add("The Day of the Lord");
        books.put("1 THESSALONIANS", Thessalonians1);

        // Data for 2 Thessalonians
        ArrayList<String> Thessalonians2 = new ArrayList<>();
        Thessalonians2.add("Greeting");
        Thessalonians2.add("Stand Fast");
        Thessalonians2.add("Pray for Us");
        books.put("2 THESSALONIANS", Thessalonians2);

        // Data for 1 Timothy
        ArrayList<String> Timothy1 = new ArrayList<>();
        Timothy1.add("Greeting");
        Timothy1.add("Pray for All Men");
        Timothy1.add("Qualifications of Overseers");
        Timothy1.add("The Great Mystery");
        Timothy1.add("Treatment of the Church Members");
        Timothy1.add("Honor the Elders");
        books.put("1 TIMOTHY", Timothy1);


        // Data for 2 Timothy
        ArrayList<String> Timothy2 = new ArrayList<>();
        Timothy2.add("Greeting");
        Timothy2.add("Be Loyal to the Faith");
        Timothy2.add("Approved and Disapproved Workers");
        Timothy2.add("Preach the Word");
        books.put("2 TIMOTHY", Timothy2);

        // Data for Titus
        ArrayList<String> Titus = new ArrayList<>();
        Titus.add("Qualified Elders");
        Titus.add("Sound Doctrine");
        Titus.add("Graces of the Heirs of Grace");
        books.put("TITUS", Titus);

        // Data for Philemon
        ArrayList<String> Philemon = new ArrayList<>();
        Philemon.add("Greeting");
        books.put("PHILEMON", Philemon);

        // Data for Hebrews
        ArrayList<String> Hebrews = new ArrayList<>();
        Hebrews.add("God’s Supreme Revelation");
        Hebrews.add("Do Not Neglect Salvation");
        Hebrews.add("The Son Was Faithful");
        Hebrews.add("The Promise of Rest");
        Hebrews.add("Our Compassionate High Priest");
        Hebrews.add("The Peril of Not Progressing");
        Hebrews.add("The King of Righteousness");
        Hebrews.add("A Better Covenant");
        Hebrews.add("The Earthly Sanctuary");
        Hebrews.add("Animal Sacrifices Insufficient");
        Hebrews.add("By Faith We Understand");
        Hebrews.add("The Discipline of God");
        Hebrews.add("Concluding Moral Directions");
        books.put("HEBREWS", Hebrews);

        // Data for James
        ArrayList<String> James = new ArrayList<>();
        James.add("Profiting from Trials");
        James.add("Beware of Personal Favoritism");
        James.add("Faith Without Works Is Dead");
        James.add("Pride Promotes Strife");
        James.add("Rich Oppressors Will Be Judged");
        books.put("JAMES", James);

        // Data for 1 Peter
        ArrayList<String> Peter1 = new ArrayList<>();
        Peter1.add("Greeting to the Elect Pilgrims");
        Peter1.add("The Living Stone and a Chosen People");
        Peter1.add("Submission to Authorities");
        Peter1.add("Christ’s Example to Be Followed");
        Peter1.add("Serving for God’s Glory");
        books.put("1 PETER", Peter1);

        // Data for 2 Peter
        ArrayList<String> Peter2 = new ArrayList<>();
        Peter2.add("Greeting the Faithful");
        Peter2.add("Destructive Doctrines");
        Peter2.add("God’s Promise Is Not Slack");
        books.put("2 PETER", Peter2);

        // Data for 1 John
        ArrayList<String> John1 = new ArrayList<>();
        John1.add("What Was Heard, Seen, and Touched");
        John1.add("The Test of Knowing Christ");
        John1.add("The Children of God");
        John1.add("The Spirit of Truth and the Spirit of Error");
        John1.add("Obedience by Faith");
        books.put("1 JOHN", John1);

        // Data for 2 John
        ArrayList<String> John2 = new ArrayList<>();
        John2.add("Greeting the Elect Lady");
        books.put("2 JOHN", John2);

        // Data for 3 John
        ArrayList<String> John3 = new ArrayList<>();
        John3.add("Greeting to Gaius");
        books.put("3 JOHN", John3);

        // Data for Jude
        ArrayList<String> Jude = new ArrayList<>();
        Jude.add("Greeting to the Called");
        books.put("JUDE", Jude);

        // Data for Revelation
        ArrayList<String> Revelation = new ArrayList<>();
        Revelation.add("Introduction and Benediction");
        Revelation.add("The Loveless Church");
        Revelation.add("The Dead Church");
        Revelation.add("The Throne Room of Heaven");
        Revelation.add("The Lamb Takes the Scroll");
        Revelation.add("First Seal: The Conqueror");
        Revelation.add("The Sealed of Israel");
        Revelation.add("The Seventh Seal and the Golden Censer");
        Revelation.add("The Fifth Trumpet: The Locusts from the Bottomless Pit");
        Revelation.add("The Mighty Angel with the Little Book");
        Revelation.add("The Two Witnesses");
        Revelation.add("The Woman, the Child, and the Dragon");
        Revelation.add("The Beast from the Sea");
        Revelation.add("The Lamb and the 144,000");
        Revelation.add("Prelude to the Bowl Judgments");
        Revelation.add("The Seven Bowls of God’s Wrath");
        Revelation.add("The Scarlet Woman and the Scarlet Beast");
        Revelation.add("The Fall of Babylon the Great");
        Revelation.add("Heaven Exults over Babylon");
        Revelation.add("Satan Bound 1,000 Years");
        Revelation.add("All Things Made New");
        Revelation.add("The River of Life");
        books.put("REVELATION", Revelation);

        return books;

    }

}
