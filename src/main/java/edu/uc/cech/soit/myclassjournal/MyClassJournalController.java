package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyClassJournalController {
    /** html */
    /** checkpoint 3 */

    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")


    public String index() {
        /** testing test and populating here*/
        JournalEntry journalEntry = new JournalEntry();/** might not need testing here*/
        journalEntry.setDate("October 2021");
        journalEntry.setNotes("My first entry!");

        String note = journalEntry.getNotes();
        String  date = journalEntry.getDate();



        return "start";
    }/** html code */


}
