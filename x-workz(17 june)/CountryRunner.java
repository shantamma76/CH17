class CountryRunner
{
public static void main(String[] args)
{
System.out.println("main is running in Country runner");

String[] totalStates={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand",
"Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu",
"Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
Country.states(totalStates);


int[] totalCodes={585103,560010,560098,585201,560001,591346,587101,573112,584101,586101};
Country.pincode(totalCodes);


String[] toalPrimeMinisters={"Jawaharlal Nehru","Gulzarilal Nanda","Lal Bahadur Shastri","Indira Gandhi","Morarji Desai","Chaudhary Charan Singh",
"Rajvi gadhi","Vishwanath Pratap Singh","Chandra Shekhar","P.V.Narasimha Rao","Atal Bihari Vajpayee","H.D.Deve Gowda","Inder Kumar Gujral",
"Manmohan Singh","Narendra Modi"};
Country.primeMinister(toalPrimeMinisters);


String[] totalCabinet={"Shri Rajnath Singh","Shri Amit Shah","Shri Nitin Jairam Gadkari","Smt. Nirmala Sitharaman","Shri Shivraj Singh Chouhan",
"Dr.Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda","Shri Manohar Lal","Shri H.D.Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra Pradhan",
"Shri Jitan Ram Manjhi","Shri Rajiv Ranjan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Kinjarapu Rammohan Naidu","Shri Pralhad Joshi",
"Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya","Shri Bhupender Yadav","Shri Gajendra Singh","Smt.Annpurna Devi",
"Shri Kiren Rijiju","Shri Hardeep Singh Puri","Dr. Mansukh Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
Country.CabinetMinisters(totalCabinet);


String[] totalPoliticalParties={"BJP","Congress","Ama Admi","Bahujan Sama","Communist"};
Country.politicalParties(totalPoliticalParties);

// Backward

Country.statesBackward(totalStates);
Country.pincodeBackward(totalCodes);
Country.primeMinisterBackward(toalPrimeMinisters);
Country.CabinetMinistersBackward(totalCabinet);
Country.politicalPartiesBackward(totalPoliticalParties);

}
}