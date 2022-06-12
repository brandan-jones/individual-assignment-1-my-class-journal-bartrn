package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyClassJournalController {

    /** additional code for testing*/
    @Autowired
    IJournalService journalService;



    /** html */
    /** checkpoint 3 */

    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/index")/** was empty*/



    public String index() {
        /** testing test and populating here*/
        JournalEntry journalEntry = new JournalEntry();/** might not need testing here*/
        journalEntry.setDate("October 2021");
        journalEntry.setNotes("My first entry!");

       /** String note = journalEntry.getNotes();
        String  date = journalEntry.getDate(); */



        return "index";
        /** was start*/
    }/** html code */


}
