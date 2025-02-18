
# IDA Auth SDK - Setup Guide

## Overview

IDA Auth SDK is a secure authentication system that requires a valid MOSIP-signed certificate to function correctly. This guide will walk you through the process of generating the required certificates and setting up the authentication flow.

## Prerequisites

Before you proceed, ensure you have the following installed:

-   **Git** (for cloning repositories)
    
-   **Bash Shell** (Git Bash for Windows, or a native terminal on Linux)
-   ![image](https://github.com/user-attachments/assets/ea44ca64-3006-44f5-a4eb-5f489c9790f9)

    

## Step 1: Clone the IDA Auth SDK Repository

First, clone the `ida-auth-sdk` repository to your local machine:

```
git clone <repository_url>
cd ida-auth-sdk
```

## Step 2: Obtain MOSIP Signed Certificates

The authentication system requires a **MOSIP-signed certificate** to function. These certificates need to be generated using the **certgen** process.

## Step 3: Configure Certgen Properties

1.  Locate and open the `cert.properties` file used for certificate generation.
    
2.  Configure the necessary fields, ensuring unique values for:
    
    -   **Email ID**
        
    -   **Partner Name**
        

## Step 4: Generate Certificates

Execute the `certgen.sh` script to generate the required certificates:

-   **On Windows:**
    
    -   Open **Git Bash** and run:
        
        ```
        bash certgen.sh
        ```
        
    -   Alternatively, double-click `certgen.sh` to execute it.
        
-   **On Linux/macOS:**
    
    ```
    bash certgen.sh
    ```
    

## Step 5: Retrieve Generated Certificates

Once `certgen.sh` executes successfully:

-   A new folder with the **partner name** (as set in `cert.properties`) will be created.
    
-   Inside this folder, you will find the required certificates:
    
    -   **client.pem**
        
    -   **rootca.pem**
        

## Step 6: Upload Certificates for API Key Generation

To proceed with authentication, upload the **client.pem** and **rootca.pem** certificates to generate the necessary API keys.

## Step 7: Self-Registration on MOSIP PMS Portal (QA Environment)

The Auth/Credential partner can register themselves on the **MOSIP PMS portal** by clicking **Register** on the landing page.

They need to fill up a form with the details below:

-   **First and Last Name**
    
-   **Organization Name**
    
-   **Partner Type** (Authentication Partner/Credential Partner)
    
-   **Address, Email, Phone Number**
    
-   **Username and Password**
    

To view the details entered, click **Home** to see the dashboard.

## Step 8: Upload of Certificates

### CA Certificate Upload

The Partner admin needs to upload the CA certificate to enable the partner for using the portal. To do so, the Partner admin:

1.  Clicks **Upload CA Certificate** option on the left navigation pane of the partner portal.
    
2.  Selects the **Partner Domain**.
    
3.  Chooses the certificate to upload (only files with extensions as `.cer` or `.pem`).
    
4.  Clicks **Upload**.
    

The uploaded certificates can be viewed by clicking on **View Certificates -> View**.

### Partner Certificate Upload

Similarly, the Partner certificates can be added by the Partner admin/partner.

## Step 9: Policy Group Mapping

On successful registration, the partner can see their username displayed on the top right corner.

1.  The partner selects the relevant **Policy Group** from the **Map Policy Group** dropdown.
    
2.  Clicks **Save**.
    



## Step 10: Mapping Policy to Policy Group

Once the certificates are uploaded:

1.  The partner maps the policy to the **Policy Group** by clicking on **Partner Policy Mapping -> +Map Policy**.
    
2.  The partner enters the **Partner Name**.
    
3.  Selects the **Auth Policy Name** from the dropdown.
    
4.  Enters a unique value for **Request Details** and clicks **Save**.
    

Once this is done, a message will appear saying **Policy mapping request submitted successfully**.

The status will be displayed as **In progress**, meaning the partner cannot generate the API key until the request is approved by the Partner admin.

## Step 11: Approval/Rejection of Partner Policy Mapping

Once the Partner Policy Mapping request is raised by the partner, the Partner admin has the privilege to approve or reject the mapping. To do so:

1.  The Partner admin logs into the **PMS portal** and clicks on **Partner Policy Mapping** in the left navigation pane.
    
2.  Selects the policy mapping that needs approval.
    
3.  From the action menu against the policy mapping, selects **Manage Policy**.
    
4.  Clicks **Approve**.
    

Once the request is approved, the partner can view the status being updated to **Approved** instead of **In Progress**.

## Step 12: Generating the API Key

Once the Partner Policy Mapping is approved by the Partner admin, the partner can generate the API key with a unique label. To do so:

1.  The partner clicks **Partner Policy Mapping** on the left navigation pane.
    
2.  From the actions menu, clicks **Generate API Key**.
    
3.  The partner enters a unique value for the **Label** field.
    
4.  Clicks **Generate**.
    

The API key is generated and can be used by the partner.

The partner can also deactivate a particular API Key by clicking on the cross-mark (**X**) next to it. Please note, once deactivated, it cannot be activated again. A new API key may need to be generated as per requirement.

## Additional Notes

-   Ensure that each field in `cert.properties` is unique for every certificate generation process.
    
-   If encountering permission issues while running `certgen.sh`, use:
    
    ```
    chmod +x certgen.sh
    ```
    
    before executing the script.
    
-   If you have access to the QA environment, you will need to have access to the **WireGuard VPN** as well to ensure secure connectivity.
